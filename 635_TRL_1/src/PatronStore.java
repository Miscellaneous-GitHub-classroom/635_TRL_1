import java.util.HashMap;

public class PatronStore
{
	private HashMap<String, Patron> patronHash;

	public PatronStore()
	{
		patronHash = new HashMap<String, Patron>();

		// load sample Patron records
		patronHash.put("S1000", new Patron("Eric", "S1000"));
		patronHash.put("S1001", new Patron("Linda", "S1001"));
		patronHash.put("S1002", new Patron("Anna", "S1002"));
		patronHash.put("S1003", new Patron("Moxie", "S1003"));
	}

	public Patron fetchPatron(String patronID)
	{
		return patronHash.get(patronID); // null if not there
	}

	public static void main(String[] args)
	{
		PatronStore pStore = new PatronStore();

		Patron p = pStore.fetchPatron("S1000");
		System.out.println(p.toString());

		Copy c = new Copy("4747");
		p.checkCopyOut(c);

		System.out.println(p);
	}
}
