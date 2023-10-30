public class Watch{ 
     String brand;
     String model;
     int price;
     boolean isSmartwatch;
     String[] features;

    
    public Watch(String brand, String model, int price, boolean isSmartwatch, String[] features) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isSmartwatch = isSmartwatch;
        this.features = features;
    }

    
    String getBrand() {
        return brand;
    }

     

     String getModel() {
        return model;
    }

     
    

     int getPrice() {
        return price;
    }

     

     boolean isSmartwatch() {
        return isSmartwatch;
    }  

     String[] getFeatures() {
        return features;
    }

    

    
     void printValues() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price:" + price);
        System.out.println("Is Smartwatch: " + isSmartwatch);
        System.out.print("Features: ");
        for (int i=0;i<features.length;i++) {
            System.out.print(features[i] + " ");
        }
        System.out.println();
    
}
}
    