/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hexlet.code;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void appHasAGreeting() {
        App app = new App();
        assertThat(app.getGreeting()).isEqualTo("Welcome to the Brain Games!");
    }
}
