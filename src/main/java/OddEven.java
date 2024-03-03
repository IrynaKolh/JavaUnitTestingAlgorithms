public class OddEven {
    public String oddEven(int num){
        if (num % 2 == 0) {
           return "Even";
        } else {
           return "Odd";
        }
    }

    private boolean isDigit(String num) {
        char[] arr = num.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isDigit(arr[i])) {
                return false;
            }
        }
        return true;
    }

    public String oddEven(String num){
        if(num == null) {
            return "Server error. Try again later...";
        } else if (num.isEmpty()) {
            return "Empty Data. Please input valid number.";
        } else {
            try {
                int number  = Integer.parseInt(num);
                if (number % 2 == 0) {
                    return "Even";
                } else {
                    return "Odd";
                }
            } catch (NumberFormatException err) {
                 if (!isDigit(num)){
                    return "Non-numeric data. Please input valid number.";
                }
                return "Out of range Data. Please input valid number.";
            }
        }
    }
}
