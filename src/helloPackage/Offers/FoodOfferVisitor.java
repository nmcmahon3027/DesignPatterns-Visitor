package helloPackage.Offers;

import helloPackage.CreditCards.BronzeCreditCard;
import helloPackage.CreditCards.GoldCreditCard;
import helloPackage.CreditCards.SilverCreditCard;

public class FoodOfferVisitor implements OfferVisitor {
	@Override
	public void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard) {
		System.out.println("Bronze card offer for food");

	}

	@Override
	public void visitGoldCreditCard(GoldCreditCard goldCreditCard) {
		System.out.println("Gold card offer for food");

	}

	@Override
	public void visitSilverCreditCard(SilverCreditCard silverCreditCard) {
		System.out.println("Silver card offer for food");

	}
}
