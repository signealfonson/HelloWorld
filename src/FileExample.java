import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class FileExample {
    public static void main(String[] args) {

        String homeFolder = System.getProperty("user.home");
        Path homePath = Path.of(homeFolder);
        Files.exists(homePath);
        Path filePath = Path.of(homeFolder, "test.txt");

        try {
            Files.createFile(filePath);
            Files.move(filePath, Path.of(homeFolder, "moved.txt"));
            Files.delete(filePath);
            Files.writeString(filePath, "Hello World", StandardOpenOption.APPEND);
            //Den sista parametern lägger till till den befintliga texten

            Files.readString(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFileAsStream(Path filePath) {
        try(Stream<String> lines = Files.lines(filePath)) { //try if implementerar autoCloseable och garanterar att filen stängs oavsett om vi lyckas eller catchar
            lines.filter(s -> !s.startsWith("#")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}

