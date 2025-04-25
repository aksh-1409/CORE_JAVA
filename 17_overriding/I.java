class X9 {
    Animal pro() {
        return null;
    }
}

class I extends X9 {
   // NOT OK
    // LivingBeing pro() {      
    //     return null;
    // }
  
//     I.java:9: error: pro() in I cannot override pro() in X9
//     LivingBeing pro() {
//                 ^
//   return type LivingBeing is not compatible with Animal
// 1 error
   
//    // NOT OK
//     Bus pro() {
//         return null;
//     }

//     I.java:20: error: pro() in I cannot override pro() in X9
//     Bus pro() {
//         ^
//   return type Bus is not compatible with Animal
// 1 error

    BDog pro() {
        return null;
    }

    // Cow pro() {
    //     return null;
    // }

    // Dog pro() {
    //     return null;
    // }

    // Animal pro() {
    //     return null;
    // }
}