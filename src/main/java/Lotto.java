import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lotto {

	public final static int PRICE_KRW = 1000;
	public final static int NUM_OF_LOTTO_NUMBERS = 6;

	private final static List<LottoNumber> CANDIDATE_LOTTO_NUMBERS =
		Stream.iterate(LottoNumber.MIN_INCLUSIVE_NUMBER, num -> num + 1)
			.limit(LottoNumber.MAX_INCLUSIVE_NUMBER)
			.map(LottoNumber::of)
			.collect(Collectors.toList());

	protected final List<LottoNumber> lottoNumbers;

	protected Lotto(List<LottoNumber> lottoNumbers) {
		this.lottoNumbers = lottoNumbers;
	}

	public int getNumOfLottoNumbers() {
		return this.lottoNumbers.size();
	}

	public static Lotto of() {
		return new Lotto(generate());
	}

	private static List<LottoNumber> generate() {
		Collections.shuffle(CANDIDATE_LOTTO_NUMBERS);
		final List<LottoNumber> numbers = CANDIDATE_LOTTO_NUMBERS.subList(0, NUM_OF_LOTTO_NUMBERS);
		numbers.sort(Comparator.comparingInt(LottoNumber::get));
		return numbers;
	}

	@Override
	public String toString() {
		return this.lottoNumbers.toString();
	}
}