package br.com.brazil.utils.faker;

import java.util.InputMismatchException;


public class DocumentsGenerator {
  private int randomize(int n) {
    int ranNum = (int) (Math.random() * n);
    return ranNum;
  }

  private int mod(int dividend, int divisor) {
    return (int) Math.round(dividend - (Math.floor(dividend / divisor) * divisor));
  }

  public String cpf() {
    final int n = 9;
    final int n1 = randomize(n);
    final int n2 = randomize(n);
    final int n3 = randomize(n);
    final int n4 = randomize(n);
    final int n5 = randomize(n);
    final int n6 = randomize(n);
    final int n7 = randomize(n);
    final int n8 = randomize(n);
    final int n9 = randomize(n);
    int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

    d1 = 11 - (mod(d1, 11));

    if (d1 >= 10)
      d1 = 0;

    int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

    d2 = 11 - (mod(d2, 11));

    if (d2 >= 10)
      d2 = 0;

    return new StringBuilder()
        .append(n1)
        .append(n2)
        .append(n3)
        .append(n4)
        .append(n5)
        .append(n6)
        .append(n7)
        .append(n8)
        .append(n9)
        .append(d1)
        .append(d2)
        .toString();
  }

  public String cnpj() {
    final int n = 9;
    final int n1 = randomize(n);
    final int n2 = randomize(n);
    final int n3 = randomize(n);
    final int n4 = randomize(n);
    final int n5 = randomize(n);
    final int n6 = randomize(n);
    final int n7 = randomize(n);
    final int n8 = randomize(n);
    final int n9 = 0;
    final int n10 = 0;
    final int n11 = 0;
    final int n12 = 1;
    int d1 = n12 * 2 + n11 * 3 + n10 * 4 + n9 * 5 + n8 * 6 + n7 * 7 + n6 * 8 + n5 * 9 + n4 * 2 + n3 * 3 + n2 * 4 + n1 * 5;

    d1 = 11 - (mod(d1, 11));

    if (d1 >= 10)
      d1 = 0;

    int d2 = d1 * 2 + n12 * 3 + n11 * 4 + n10 * 5 + n9 * 6 + n8 * 7 + n7 * 8 + n6 * 9 + n5 * 2 + n4 * 3 + n3 * 4 + n2 * 5 + n1 * 6;

    d2 = 11 - (mod(d2, 11));

    if (d2 >= 10)
      d2 = 0;

    return new StringBuilder()
        .append(n1)
        .append(n2)
        .append(n3)
        .append(n4)
        .append(n5)
        .append(n6)
        .append(n7)
        .append(n8)
        .append(n9)
        .append(n10)
        .append(n11)
        .append(n12)
        .append(d1)
        .append(d2)
        .toString();
  }

  public String rg() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 9; i++) {
      sb.append(this.randomize(9));
    }
    return sb.toString();
  }
}