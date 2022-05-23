package br.com.brazil.utils.faker;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class BrazilFaker extends Faker {

  private final BrazilianCompany company;
  private final BrazilIdNumber idNumber;

  public BrazilFaker(FakeValuesService fakeValuesService, RandomService random) {
    super(fakeValuesService, random);
    this.company = new BrazilianCompany(this);
    this.idNumber = new BrazilIdNumber(this);
  }

  public BrazilianCompany company() {
    return this.company;
  }

  @Override
  public BrazilIdNumber idNumber() {
    return this.idNumber();
  }
}
