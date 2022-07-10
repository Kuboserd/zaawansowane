import obiektowe.plik.task2.poczta.Paczka;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PaczkaTest {
    @Test
    void shouldValidateNames() {
        //given
        String name1 = "Jakub Graczyk";
        String name2 = "Hasibur R Rahman";
        float weight = 40;
        //when
        Paczka paczka = new Paczka(name1, name2, weight);
        //then
        assertThat(paczka.getRecipient()).isEqualTo(name1);
        assertThat(paczka.getSender()).isEqualTo(name2);
        assertThat(paczka.getWeight()).isEqualTo(weight);
    }
}
