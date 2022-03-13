public class Main {
    public static void main(String[] args) {
        
        AdsService adsService = new AdsService();
        VehicleAd ad1 = new VehicleAd("Volvo", "123", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd ad2 = new VehicleAd("Kamaz", "45", new TruckType(),new PickupType(), new DieselType());

        adsService.setAdList(new VehicleAd[]
                             {ad1, ad2});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        adsService.filterByVehicleTypeByPurpose(new TruckType());
    }
}