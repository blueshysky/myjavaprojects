import java.util.Arrays;

public class bankRecordTest {

	public static void main(String[] args) {

		BankRecords bk = new BankRecords();
		bk.readData();
		SexComparative sc = new SexComparative();

		Arrays.sort(bk.robjs, new SexComparative());

	}

}
