import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LottoTest {

	@ParameterizedTest
	@ValueSource(strings = {"1,2", "1,2,3,4,5,6,7", "1,1,2,3,4,5"})
	public void from_tooShort_tooLong_duplicated(String input) {
		assertThatExceptionOfType(LottoFormatException.class)
			.isThrownBy(() -> Lotto.from(input))
			.withMessage(LottoFormatException.ERROR_MESSAGE);
	}

	@Test
	void hasBonus() {
		final WinningLotto winningLotto = WinningLottoBuilder.aWinningLotto()
			.withLottoNumbers("1,2,3,4,5,6")
			.withBonus("45")
			.build();
		assertThat(Lotto.from("1,2,3,4,5,6").hasBonus(winningLotto)).isFalse();
		assertThat(Lotto.from("1,2,3,4,5,45").hasBonus(winningLotto)).isTrue();
	}
}
