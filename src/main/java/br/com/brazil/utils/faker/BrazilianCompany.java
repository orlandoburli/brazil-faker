package br.com.brazil.utils.faker;

import com.github.javafaker.Company;
import com.github.javafaker.Faker;

public class BrazilianCompany extends Company {

  private final DocumentsGenerator documentsGenerator;

  protected BrazilianCompany(Faker faker) {
    super(faker);
    this.documentsGenerator = new DocumentsGenerator();
  }

  private String cnpj() {
    return this.documentsGenerator.cnpj();
  }
}