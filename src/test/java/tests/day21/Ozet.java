package tests.day21;

public class Ozet {
     /*
    - XML: HTML gibi data transfer formatidir.
    - TestNG ile XML dosya kullanmamizin seebi: toplu dosya calistirmak istedigimizde, hangi dosyalarin
    calismasini veya calismamasini istedimizde TestNG'ye XML dostalar ile iletebiliriz.
    - XML dosyalar sayesinde istedigimiz level'daki testlerimizi toplu olarak calistirabiliriz, bunun icin
    suite'den baslayarak testlerimizi sectigimiz level'a kadar sirasiyla(hiyerarsik olarak) taglari olusturmaliyiz.

    - Eger birden fazla hiyerarsiye ihtiyacimiz varsa, ayrilma level'ini iyi tesbit edip. o noktadan itibaren
    birden fazla hiyerarsi olusturabiliriz.

    - Eger bir test olustururken farkli package ve class'lardan test methodlari calistiracaksak, hiyerarsik olarak
    herbir method'a ulasmak zahmetli olacaktir. Bu durumda groups devreye girer. Istedigimiz test methoduna istedigimiz
    kadar groups atayabiliriz. Ve bu groups'lari istedigimiz zaman calistirabiliriz.
        Groups secimi yapilirken dikkat edilmesi gerekenler
        1. Calisacak ve calismayacak groups'lari belirlerken
        2. Bu groups'larin nerede aranacagini belirler

    - Groups olarak XML'den calistirdigimizda include ve exclude sayesinde groups'lari istedigimiz sekilde
    organize edebiliriz.

     */
}
