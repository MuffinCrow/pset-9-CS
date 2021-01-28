import java.util.ArrayList;
import java.util.Arrays;

public class ProblemSet9 {

    public int[] evenOdd(int[] arr) {
        if (arr != null) {
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            for (int i : arr) {
                if (i % 2 == 0) {
                    even.add(i);
                } else {
                    odd.add(i);
                }
            }
            int[] output = new int[arr.length];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i >= even.size()) {
                    output[i] = odd.get(count);
                    count++;
                } else {
                    output[i] = even.get(i);
                }
            }
            return output;
        }
        return null;
    }

    public int[] notAlone(int[] arr, int alone) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i != 0 && i != arr.length-1 && arr[i] != arr[i+1] &&
                        arr[i] != arr[i-1] && arr[i] == alone) {
                    if (arr[i] < arr[i-1]) {
                        arr[i] = arr[i-1];
                    }
                    if (arr[i] < arr[i+1]) {
                        arr[i] = arr[i+1];
                    }
                }
            }
            return arr;
        }
        return null;
    }

    public int[] shiftLeft(int[] arr) {
        if (arr != null) {
            int num = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length - 1) {
                    arr[i] = arr[i + 1];
                }
            }
            arr[arr.length - 1] = num;
            return arr;
        }
        return null;
    }

    public int[] fillIn(int start, int end) {
        if (start <= end) {
            int[] output = new int[end - start];
            int count = start;
            if (end - start == 0) {
                return output;
            } else {
                for (int i = 0; i < end - start; i++) {
                    output[i] = count;
                    count++;
                }
            }
            return output;
        }
        return null;
    }

    public boolean triple(int[] arr) {
        if (arr != null) {
            int count = 0;
            for (int i : arr) {
                if (i == 3) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public int pairs(int[] a, int[] b) {
        if (a != null && b != null && a.length == b.length) {
            int count = 0;
            int num;
            for (int i = 0; i < a.length; i++) {
                num = a[i] - b[i];
                if (num <=2 && num >= -2 && num != 0) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    public boolean twentyFour(int[] arr) {
        if (arr != null) {
            boolean isTwo = false;
            boolean isFour = false;
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    if (arr[i] == 2) {
                        if (arr[i + 1] == 2) {
                            isTwo = true;
                        }
                    }
                    if (arr[i] == 4) {
                        if (arr[i + 1] == 4) {
                            isFour = true;
                        }
                    }
                } else if (i == arr.length - 1) {
                    if (arr[i] == 2) {
                        if (arr[i - 1] == 2) {
                            isTwo = true;
                        }
                    }
                    if (arr[i] == 4) {
                        if (arr[i - 1] == 4) {
                            isFour = true;
                        }
                    }
                } else {
                    if (arr[i] == 2) {
                        if (arr[i + 1] == 2 || arr[i - 1] == 2) {
                            isTwo = true;
                        }
                    }
                    if (arr[i] == 4) {
                        if (arr[i + 1] == 4 || arr[i - 1] == 4) {
                            isFour = true;
                        }
                    }
                }
            }
            if ((isFour == true && isTwo == false) || (isFour == false && isTwo == true)) {
                return true;
            }
        }
        return false;
    }

    public boolean fourteen(int[] arr) {
        if (arr != null) {
            for (int i : arr) {
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }
        return false;
    }

    public int centeredAverage(int[] arr) {
        if (arr != null && arr.length >= 3) {
            int sm = arr[0];
            int lg = arr[0];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > lg) {
                    lg = arr[i];
                }
                if (arr[i] < sm) {
                    sm = arr[i];
                }
                count += arr[i];
            }
            int output = count - sm - lg;
            output /= arr.length - 2;
            return output;
        }
        return -1;
    }

    public int outliers(int[] arr) {
        if (arr != null && arr.length >= 1) {
            int sm = arr[0];
            int lg = arr[0];
            for (int i : arr) {
                if (i > lg) {
                    lg = i;
                }
                if (i < sm) {
                    sm = i;
                }
            }
            int output = lg - sm;
            return output;
        }
        return -1;
    }
}