package no.hvl.dat102.mengde.kjedet;

import no.hvl.dat102.mengde.adt.MengdeADTTest;
import no.hvl.dat102.mengde.adt.MengdeADT;

public class KjedetMengdeTest extends MengdeADTTest {

	@Override
	protected MengdeADT<String> reset() {
		return new KjedetMengde<String>();
	}

}
