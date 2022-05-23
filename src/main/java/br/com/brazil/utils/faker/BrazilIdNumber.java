package br.com.brazil.utils.faker;

import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;

public class BrazilIdNumber extends IdNumber {
  private final DocumentsGenerator documentsGenerator;

  protected BrazilIdNumber(Faker faker) {
    super(faker);
    documentsGenerator = new DocumentsGenerator();
  }

  public String cpf() {
    return this.documentsGenerator.cpf();
  }

  public String rg() {
    return this.documentsGenerator.rg();
  }
}