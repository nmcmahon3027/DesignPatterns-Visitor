package helloPackage.CreditCards;

import helloPackage.Offers.OfferVisitor;

public class SilverCreditCard implements CreditCard {
	@Override
	public String getName() {
		return "This is the Silver Card";
	}

	@Override
	public void accept(OfferVisitor offerVisitor) {
		offerVisitor.visitSilverCreditCard(this);

	}
}
