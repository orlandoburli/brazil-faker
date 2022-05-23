package br.com.brazil.utils.faker;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;
import java.util.Random;

public class BrazilFaker extends Faker {

  private BrazilianCompany company;
  private BrazilIdNumber idNumber;

  public BrazilFaker() {
    super();
    this.init();
  }

  public BrazilFaker(Locale locale) {
    super(locale, (Random)null);
    this.init();
  }

  public BrazilFaker(Random random) {
    super(Locale.ENGLISH, random);
    this.init();
  }

  public BrazilFaker(Locale locale, Random random) {
    super(locale, new RandomService(random));
    this.init();
  }

  public BrazilFaker(Locale locale, RandomService randomService) {
    super(new FakeValuesService(locale, randomService), randomService);
    this.init();
  }

  public BrazilFaker(FakeValuesService fakeValuesService, RandomService random) {
    super(fakeValuesService, random);
    this.init();
  }

  private void init() {
    this.company = new BrazilianCompany(this);
    this.idNumber = new BrazilIdNumber(this);
  }

  public BrazilianCompany company() {
    return this.company;
  }

  @Override
  public BrazilIdNumber idNumber() {
    return this.idNumber;
  }
}
