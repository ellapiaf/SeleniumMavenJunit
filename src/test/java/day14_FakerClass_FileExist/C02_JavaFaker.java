package day14_FakerClass_FileExist;

import com.github.javafaker.Faker;
import org.junit.Test;
import utilities.TestBase;

public class C02_JavaFaker  extends TestBase {

    @Test
    public void javaFakerTest() {
        //faker objesi olustur.
         Faker    faker= new Faker();

       //yada yukarida ki obje olusturmadan Faker.instance() static metodu ile baslayabiliriz

        Faker.instance();

      //Firstname yazdirin:
        System.out.println(faker.name());
        //Lastname yazdırın:
        //System.out.println(Faker.instance().name().lastName());
        System.out.println(faker.name().lastName());

        //Kullanıcı adı yazdırın:
        System.out.println(faker.name().username());

        //Funny Name yazdırın:
        System.out.println(faker.funnyName().name());

        //Meslek ismi yazdırın:
        System.out.println(faker.name().title());

        //Şehir ismi yazdırın:
        System.out.println(faker.address().city());

        //Eyalet yazdırın:
        System.out.println(faker.address().state());

        //Full Address yazdırın:
        System.out.println(faker.address().fullAddress());

        //Cep numarası yazdırın:
        System.out.println(faker.phoneNumber().cellPhone());

        //Email yazdırın:
        System.out.println(faker.internet().emailAddress());

        //Posta kodu yazdırın:
        System.out.println(faker.address().zipCode());

        //Rastgele 15 haneli numara yazdırın:
        System.out.println(faker.number().digits(15));
    }
}
