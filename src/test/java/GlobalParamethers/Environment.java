package GlobalParamethers;

public enum Environment {

    HeadOffice("Головной офис"),
    Moscow("Москва, Пресненская набережная, 12"),
    Office("Офис разработки"),
    PhoneNumber("+7 (499) 113-68-89"),
    Tumen("Тюмень, ул. Малыгина 84 к1, 7 этаж"),
    Email("mail@crtweb.ru");

    private final String text;

    Environment(String text) {
        this.text = text;
    }

    public String getContacts() {
        return text;
    }
}
