import java.util.Scanner;

class calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char homeConf = 'Y';

        while (homeConf == 'Y') {
            System.out.println("\n\t\t\t\t\t __   ______             __           ");
            System.out.println("\t\t\t\t\t|  \\ /      \\           |  \\          ");
            System.out.println("\t\t\t\t\t \\$$|  $$$$$$\\  ______  | $$  _______ ");
            System.out.println("\t\t\t\t\t|  \\| $$   \\$$ |      \\ | $$ /       \\");
            System.out.println("\t\t\t\t\t| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
            System.out.println("\t\t\t\t\t| $$| $$   __  /      $$| $$| $$      ");
            System.out.println("\t\t\t\t\t| $$| $$__/  \\|  $$$$$$$| $$| $$_____ ");
            System.out.println("\t\t\t\t\t| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
            System.out.println("\t\t\t\t\t \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$\n\n");

            System.out.println(
                    "  _   _                       _                       _____                                        _            ");
            System.out.println(
                    " | \\ | |                     | |                     / ____|                                      | |           ");
            System.out.println(
                    " |  \\| |  _   _   _ __ ___   | |__     ___   _ __   | |        ___    _ __   __   __  ___   _ __  | |_    ___   _ __ ");
            System.out.println(
                    " | . ` | | | | | | '_ ` _ \\  | '_ \\   / _ \\ | '__|  | |       / _ \\  | '_ \\  \\ \\ / / / _ \\ | '__| | __|  / _ \\ | '__|");
            System.out.println(
                    " | |\\  | | |_| | | | | | | | | |_) | |  __/ | |     | |____  | (_) | | | | |  \\ V / |  __/ | |    | |_  |  __/ | |   ");
            System.out.println(
                    " |_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|      \\_____|  \\___/  |_| |_|   \\_/   \\___| |_|     \\__|  \\___| |_|   \n");

            System.out.println(
                    "========================================================================================================================\n");

            System.out.println("[01] Decimal Converter");
            System.out.println("[02] Binary Converter");
            System.out.println("[03] Octal Converter");
            System.out.println("[04] Hexadecimal Converter");
            System.out.println("[05] Roman Number Converter\n\n");

            System.out.print("Enter Option -> ");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    char conf1 = 'Y';

                    while (conf1 == 'Y') {
                        System.out.println("\n+-------------------------------------------+");
                        System.out.println("|             Decimal Converter             |");
                        System.out.println("+-------------------------------------------+\n\n");

                        System.out.print("Enter an Decimal number: ");
                        int num = input.nextInt();
                        input.nextLine();

                        if (num > 0) {
                            int decimal = num;
                            int octalNum = num;
                            int hexadecimalNum = num;
                            String binary = "";
                            String octal = "";
                            String hexadecimal = "";

                            while (decimal != 0) {
                                int remainder = decimal % 2;
                                binary = remainder + binary;
                                decimal /= 2;
                            }

                            while (octalNum != 0) {
                                int remainder = octalNum % 8;
                                octal = remainder + octal;
                                octalNum /= 8;
                            }

                            while (hexadecimalNum != 0) {
                                int remainder = hexadecimalNum % 16;
                                if (remainder < 10) {
                                    hexadecimal = remainder + hexadecimal;
                                } else {
                                    char ch = (char) ('A' + (remainder - 10));
                                    hexadecimal = ch + hexadecimal;
                                }
                                hexadecimalNum /= 16;
                            }

                            System.out.println("\n\tBinary number: " + binary);
                            System.out.println("\tOctal number: " + octal);
                            System.out.println("\tHexadecimal number: " + hexadecimal + "\n\n");
                            System.out.print("Do you want to go to homepage (Y/N) -> ");
                            char backToHome = input.next().charAt(0);
                            if (backToHome == 'Y' || backToHome == 'y') {
                                conf1 = 'N';
                            } else {
                                conf1 = 'N';
                                homeConf = 'N';
                            }
                        } else {
                            System.out.println("Invalid input...\n");
                            System.out.print("Do you want to input number again (Y/N) -> ");
                            char backToConverter = input.next().charAt(0);
                            if (backToConverter == 'Y' || backToConverter == 'y'){
                                conf1 = 'Y';
                            }else{
                                homeConf = 'N';
                                conf1 = 'N';
                            }
                        }
                    }
                    break;

                case 2:
                    char conf2 = 'Y';

                    while (conf2 == 'Y') {
                        System.out.println("\n+-------------------------------------------+");
                        System.out.println("|             Binary Converter             |");
                        System.out.println("+-------------------------------------------+\n\n");

                        System.out.print("Enter an Binary number: ");
                        int binary = input.nextInt();
                        input.nextLine();

                        int tempBinary = binary;
                        boolean validity = true;

                        while (tempBinary != 0) {
                            int digit = tempBinary % 10;
                            tempBinary /= 10;
                            if (digit != 0 && digit != 1) {
                                validity = false;
                                break;
                            }
                        }

                        if (validity == true) {
                            int decimal = 0;
                            int pow = 1;
                            int temp = binary;

                            while (temp != 0) {
                                int lastDigit = temp % 10;
                                decimal += lastDigit * pow;
                                temp /= 10;
                                pow *= 2;
                            }

                            int octalNum = decimal;
                            String octal = "";
                            while (octalNum != 0) {
                                int remainder = octalNum % 8;
                                octal = remainder + octal;
                                octalNum /= 8;
                            }

                            int hexadecimalNum = decimal;
                            String hexadecimal = "";
                            while (hexadecimalNum != 0) {
                                int remainder = hexadecimalNum % 16;
                                if (remainder < 10) {
                                    hexadecimal = remainder + hexadecimal;
                                } else {
                                    char ch = (char) ('A' + (remainder - 10));
                                    hexadecimal = ch + hexadecimal;
                                }
                                hexadecimalNum /= 16;
                            }

                            System.out.println("\tDecimal Number : " + decimal);
                            System.out.println("\tOctal number: " + octal);
                            System.out.println("\tHexadecimal number: " + hexadecimal + "\n\n");
                            System.out.print("Do you want to go to homepage (Y/N) -> ");
                            char backToHome = input.next().charAt(0);
                            if (backToHome == 'Y' || backToHome == 'y') {
                                conf2 = 'N';
                            } else {
                                conf2 = 'N';
                                homeConf = 'N';
                            }

                        } else {
                            System.out.println("Invalid input...\n");
                            System.out.print("Do you want to input number again (Y/N) -> ");
                            char backToConverter = input.next().charAt(0);
                            if (backToConverter == 'Y' || backToConverter == 'y'){
                                conf2 = 'Y';
                            }else{
                                homeConf = 'N';
                                conf2 = 'N';
                            }
                        }
                    }
                    break;

                case 3:
                    char conf3 = 'Y';

                    while (conf3 == 'Y') {
                        System.out.println("\n+-------------------------------------------+");
                        System.out.println("|             Octal Converter             |");
                        System.out.println("+-------------------------------------------+\n\n");

                        System.out.print("Enter an Octal number: ");
                        int octal = input.nextInt();
                        input.nextLine();

                        int tempOctal = octal;
                        boolean validity = true;

                        while (tempOctal != 0) {
                            int digit = tempOctal % 10;
                            tempOctal /= 10;
                            if (!(digit >= 0 && digit < 8)) {
                                validity = false;
                                break;
                            }
                        }

                        if (validity == true) {
                            int decimal = 0;
                            int base = 1;
                            int temp = octal;

                            while (temp != 0) {
                                int lastDigit = temp % 10;
                                decimal += lastDigit * base;
                                temp /= 10;
                                base *= 8;
                            }
                            int tempDecimal = decimal;
                            String binary = "";
                            while (tempDecimal != 0) {
                                int remainder = tempDecimal % 2;
                                binary = remainder + binary;
                                tempDecimal /= 2;
                            }

                            int hexadecimalNum = decimal;
                            String hexadecimal = "";
                            while (hexadecimalNum != 0) {
                                int remainder = hexadecimalNum % 16;
                                if (remainder < 10) {
                                    hexadecimal = remainder + hexadecimal;
                                } else {
                                    char ch = (char) ('A' + (remainder - 10));
                                    hexadecimal = ch + hexadecimal;
                                }
                                hexadecimalNum /= 16;
                            }

                            System.out.println("\n\tDecimal Number : " + decimal);
                            System.out.println("\tBinary number: " + binary);
                            System.out.println("\tHexadecimal number: " + hexadecimal + "\n\n");
                            System.out.print("Do you want to go to homepage (Y/N) -> ");
                            char backToHome = input.next().charAt(0);
                            if (backToHome == 'Y' || backToHome == 'y') {
                                conf3 = 'N';
                            } else {
                                conf3 = 'N';
                                homeConf = 'N';
                            }

                        } else {
                            System.out.println("Invalid input...\n");
                            System.out.print("Do you want to input number again (Y/N) -> ");
                            char backToConverter = input.next().charAt(0);
                            if (backToConverter == 'Y' || backToConverter == 'y'){
                                conf3 = 'Y';
                            }else{
                                homeConf = 'N';
                                conf3 = 'N';
                            }
                        }
                    }
                    break;

                case 4:
                    break;

                case 5:
                    break;

                default:
                    break;
            }
        }

    }

}