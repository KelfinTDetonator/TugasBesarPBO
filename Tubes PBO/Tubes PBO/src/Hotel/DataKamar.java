package Hotel;

public class DataKamar {
    Kamar d103 = new Kamar("103","Deluxe Room",3000000);
    Kamar d104 = new Kamar("104","Standard Single Room",1000000);
    Kamar f505 = new Kamar("505","Executive Room",5000000);
    Kamar f506 = new Kamar("506","Executive Room",5000000);
    Kamar f401 = new Kamar("401","Standard Single Room",2000000);
    Kamar k302 = new Kamar("302","Executive Room",6000000);
    Kamar k203 = new Kamar("203","Deluxe Room",4000000);
    Kamar a112 = new Kamar("112","Standard Single Room",2000000);
    Kamar a114 = new Kamar("114","Double Single Room",2500000);
    Hotel DelLuna = new Hotel("Hotel Del Luna","Jakarta", "Bintang 3");
    Hotel FiveSeasons = new Hotel("Hotel Five Seasons", "Surabaya", "Bintang 5");
    Hotel Kayana = new Hotel("Hotel Kayana", "Bali", "Bintang 5");
    Hotel Amara = new Hotel("Hotel Amara", "Jakarta", "Bintang 4");
    Kamar[] kamarDelLuna = {d103, d104};
    Kamar[] kamarFS = {f505, f506, f401};
    Kamar[] kamarKayana = {k302, k203};
    Kamar[] KamarAmara = {a112, a114};
}
