import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String islemSecenekleri = "Bakiye Görüntüleme -->1\n" +
                "Para çekmek -->2\n" +
                "Para yatırmak -->3\n" +
                "Başka hesaba para göndermek için -->4\n" +
                "Kredi ödemek için -->5\n" +
                "Fatura ödemek için -->6\n" +
                "Kripto yatırımı için -->7\n" +
                "Çıkış için -->8";



        double Solana = 154.397*5;
        double Bitcoin = 62.099;
        double Etherium = 3426*5;
        double Avax = 28.76*5;
        double Xrp = 0.4850*100;

        int Konut_kredisi = 985000 / 27;
        int Tasit_kredisi = 270000 / 12;
        int Is_kredisi = 450000 / 19;
        int Ihtiyac_kredisi = 30000 / 6;

        int Elektrik = 480;
        int Su = 140;
        int Dogalgaz = 670;
        int Internet = 220;

        double egeBakiye = 74000;
        String egeIban = "TR5441 3270 0000 55 7811 83";
        String egeUsername = "egeavcu6";
        String egePassword = "2232";

        double elifBakiye = 1800;
        String elifIban = "TR3446 6991 5678 12 4412 77";
        String elifUsername = "elfnazz";
        String elifPassword = "4506";

        System.out.println("ATM'ye Hoşgeldiniz :) ");
        System.out.println("Bilgilerinizi Tuşlayınız : ");

        System.out.println("Kullanıcı adınızı giriniz : ");
        String kullaniciAd = scanner.nextLine();

        System.out.println("Şifrenizi giriniz : ");
        String sifre = scanner.nextLine();

        if (kullaniciAd.equals(egeUsername) && sifre.equals(egePassword)) {
            System.out.println("Ege bey hoşgeldiniz");
            System.out.println(islemSecenekleri);
            System.out.println("Lütfen seçim yapınız : ");
            String secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz : " + egeBakiye);
                    break;
                case "2":
                    System.out.println("Çekmek istediğiniz tutarı giriniz :");
                    int cekilecekTutar = scanner.nextInt();
                    if (cekilecekTutar > egeBakiye) {
                        System.out.println("Yeterli bakiye bulunmamaktadır");
                    } else {
                        System.out.println("Paranız hazırlanıyor, kısa süre sonra çekme işlemi tamamlanacaktır");
                        egeBakiye -= cekilecekTutar;
                        System.out.println("Kalan bakiye: " + egeBakiye);
                    }
                    break;
                case "3":
                    System.out.println("Yatırmak istediğiniz tutarı giriniz :");
                    int yatirilacakTutar = scanner.nextInt();
                    egeBakiye += yatirilacakTutar;
                    System.out.println("Yeni bakiye: " + egeBakiye);
                    break;
                case "4":
                    scanner.nextLine(); // Buffer'ı temizle
                    System.out.println("Göndermek istediğiniz IBAN giriniz :");
                    String gonderilecekIban = scanner.nextLine();
                    System.out.println("Tutar giriniz :");
                    int tutar = scanner.nextInt();
                    if (gonderilecekIban.equals(elifIban)) {
                        if (tutar > egeBakiye) {
                            System.out.println("Yeterli bakiye bulunmamaktadır");
                        } else {
                            System.out.println("Havale işlemi gerçekleşiyor..");
                            egeBakiye -= tutar;
                            elifBakiye += tutar;
                            System.out.println("Ege yeni bakiye: " + egeBakiye);
                            System.out.println("Elif yeni bakiye: " + elifBakiye);
                        }
                    } else {
                        System.out.println("IBAN geçerli değil");
                    }
                    break;
                case "5":
                    System.out.println("Ödemek istediğiniz krediyi giriniz :");
                    System.out.println("1.Konut Kredisi\n2.Tasit Kredisi\n3.İhtiyac Kredisi\n4.İş Kredisi");
                    String krediOdeme = scanner.nextLine();

                    switch (krediOdeme) {
                        case "1":
                            System.out.println("Konut kredisi ilk taksidi yatırılıyor onaylıyor musunuz 1-Onayla/2-Reddet ?");
                            String onay1 = scanner.nextLine();
                            if (onay1.equals("1")) {
                                if (egeBakiye >= Konut_kredisi) {
                                    egeBakiye -= Konut_kredisi;
                                    System.out.println("Konut kredisi ödemesi tamamlandı");
                                    System.out.println("Kalan bakiye: " + egeBakiye);
                                } else {
                                    System.out.println("Yeterli bakiye bulunmamaktadır");
                                }
                            } else {
                                System.out.println("Ödeme reddedildi...");
                            }
                            break;
                        case "2":
                            System.out.println("Tasit kredisi ilk taksidi yatırılıyor onaylıyor musunuz 1-Onayla/2-Reddet ?");
                            String onay2 = scanner.nextLine();
                            if (onay2.equals("1")) {
                                if (egeBakiye >= Tasit_kredisi) {
                                    egeBakiye -= Tasit_kredisi;
                                    System.out.println("Tasit kredisi ödemesi tamamlandı");
                                    System.out.println("Kalan bakiye: " + egeBakiye);
                                } else {
                                    System.out.println("Yeterli bakiye bulunmamaktadır");
                                }
                            } else {
                                System.out.println("Ödeme reddedildi...");
                            }
                            break;
                        case "3":
                            System.out.println("İhtiyac kredisi ilk taksidi yatırılıyor onaylıyor musunuz 1-Onayla/2-Reddet ?");
                            String onay3 = scanner.nextLine();
                            if (onay3.equals("1")) {
                                if (egeBakiye >= Ihtiyac_kredisi) {
                                    egeBakiye -= Ihtiyac_kredisi;
                                    System.out.println("İhtiyac kredisi ödemesi tamamlandı");
                                    System.out.println("Kalan bakiye: " + egeBakiye);
                                } else {
                                    System.out.println("Yeterli bakiye bulunmamaktadır");
                                }
                            } else {
                                System.out.println("Ödeme reddedildi...");
                            }
                            break;
                        case "4":
                            System.out.println("İş kredisi ilk taksidi yatırılıyor onaylıyor musunuz 1-Onayla/2-Reddet ?");
                            String onay4 = scanner.nextLine();
                            if (onay4.equals("1")) {
                                if (egeBakiye >= Is_kredisi) {
                                    egeBakiye -= Is_kredisi;
                                    System.out.println("İş kredisi ödemesi tamamlandı");
                                    System.out.println("Kalan bakiye: " + egeBakiye);
                                } else {
                                    System.out.println("Yeterli bakiye bulunmamaktadır");
                                }
                            } else {
                                System.out.println("Ödeme reddedildi...");
                            }
                            break;
                        default:
                            System.out.println("Geçersiz kredi seçimi");
                    }
                    break;
                case "6":
                    System.out.println("Ödemek istediğiniz faturayı giriniz :");
                    System.out.println("1.Elektrik\n2.Su\n3.Dogalgaz\n4.İnternet");
                    String fatura = scanner.nextLine();
                    switch (fatura) {
                        case "1":
                            System.out.println("Elektrik faturanızın ücreti ödeniyor : " + Elektrik);
                            egeBakiye -= Elektrik;
                            System.out.println("Kalan bakiyeniz: " + egeBakiye);
                            break;
                        case "2":
                            System.out.println("Su faturası ücreti ödeniyor : " + Su);
                            egeBakiye -= Su;
                            System.out.println("Kalan bakiyeniz: " + egeBakiye);
                            break;
                        case "3":
                            System.out.println("Doğalgaz faturası ödeniyor : " + Dogalgaz);
                            egeBakiye -= Dogalgaz;
                            System.out.println("Kalan bakiyeniz: " + egeBakiye);
                            break;
                        case "4":
                            System.out.println("İnternet faturası ödeniyor : " + Internet);
                            egeBakiye -= Internet;
                            System.out.println("Kalan bakiyeniz: " + egeBakiye);
                            break;
                        default:
                            System.out.println("Geçersiz seçim");
                            break;
                    }
                    break;
                case "7":
                    System.out.println("Kripto yatırım bölümüne hoşgeldiniz");

                    System.out.println("Yatırım yapmak istediğiniz coini girin :");
                    System.out.println("1.Solana\n2.Bitcoin\n3.Ethereum\n4.Avalanche\n5.XRP");
                    String kripto = scanner.nextLine();
                    switch (kripto) {
                        case "1":
                            System.out.println("Solana yatırımı yapılıyor...");
                            egeBakiye -=Solana;
                            System.out.println("Kalan bakiye : " + egeBakiye);
                            break;
                        case "2":
                            System.out.println("Bitcoin yatırımı yapılıyor...");
                            egeBakiye -=Bitcoin;
                            System.out.println("Kalan bakiye : " + egeBakiye);
                            break;
                        case "3":
                            System.out.println("Ethereum yatırımı yapılıyor...");
                            egeBakiye -=Etherium;
                            System.out.println("Kalan bakiye : " + egeBakiye);
                            break;
                        case "4":
                            System.out.println("Avalanche yatırımı yapılıyor...");
                            egeBakiye -=Avax;
                            System.out.println("Kalan bakiye : " + egeBakiye);
                            break;
                        case "5":
                            System.out.println("XRP yatırımı yapılıyor...");
                            egeBakiye -=Xrp;
                            System.out.println("Kalan bakiye : " + egeBakiye);
                            break;
                        default:
                            System.out.println("Geçersiz seçim");
                            break;
                    }
                    break;
                case "8":
                    System.out.println("Çıkış yapılıyor, iyi günler dileriz.");
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
                    break;
            }
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
        }
    }
}