public class TeenNumberChecker {
    public static boolean hasTeen (int param1, int param2, int param3) {
        if (param1 >= 13 )
            if (param1 <= 19 ) return true;
        if (param2 >= 13)
            if (param2 <= 19 ) return true;
         if (param3 >= 13)
            if(param3 <= 19 ) return true;
         return false;
    }
    public static boolean isTeen (int param1) {
        if (param1 >= 13)
            if (param1 <= 19) return true;
            return false;
    }
}
