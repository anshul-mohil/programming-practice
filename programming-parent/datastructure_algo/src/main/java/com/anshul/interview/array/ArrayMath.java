package com.anshul.interview.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayMath {
	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public int[] spiralOrder(final int[][] a) {

		int top = 0;
		int left = 0;
		int bottom = a.length - 1;
		int right = a[0].length - 1;
		int direction = 0;
		int array[] = new int[bottom + 1 * right + 1];
		int counter = 0;
		while (top < bottom && left < right) {
			if (direction == 0) {
				for (int i = left; i <= right; i++) {
					System.out.println(a[top][i]);
					array[counter++] = a[top][i];
				}
				top++;
				direction++;
			} else if (direction == 1) {
				for (int i = top; i <= bottom; i++) {
					System.out.println(a[i][right]);
					array[counter++] = a[i][right];
				}
				right--;
				direction++;
			} else if (direction == 2) {
				for (int i = right; i <= left; i--) {
					System.out.println(a[bottom][i]);
					array[counter++] = a[bottom][i];
				}
				bottom--;
				direction++;
			} else if (direction == 3) {
				for (int i = bottom; i <= top; i--) {
					System.out.println(a[i][left]);
					array[counter++] = a[i][left];
				}
				left++;
				direction = 0;
			}
		}
		return array;
	}

  /**
   * Working and ready to upload
   *
   * @param a
   * @param b
   * @return
   */
  public int coverPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
    int totalSteps = 0;
    for (int i = 1; i < a.size(); i++) {
      totalSteps += Math.max(Math.abs(a.get(i) - a.get(i - 1)), Math.abs(b.get(i) - b.get(i - 1)));
    }

    return totalSteps;
  }

	public static int[] plusOne(int[] digits) {

		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;

		return newNumber;
    }

  private static long getSumOfN(int inputSize) {
    long input = (long) inputSize;
    return (long) ((input * (input + 1)) / 2);
  }

  private static long getSumOfInputArray(List<Integer> input) {
    long value = 0;
    for (Integer integer : input) {
      long num = integer;
      value += num;
    }
    return value;
  }

  private static long getSumOfInputArraySquare(List<Integer> input) {
    long value = 0;
    for (Integer integer : input) {
      long num = integer;
      value += (num * num);
    }
    return value;
  }

  // public static void main(String[] args) {

  // // int[] a = new int[] { 8, 8, 8, 9 };
  // // a = plusOne(a);
  // // for (int i = 0; i < a.length; i++) {
  // // System.out.println(a[i]);
  // // }
  // ArrayMath a1 = new ArrayMath();
  // // int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
  // int arr[] = { 3, 1, 5, 4, 2, 2 };
  // int n = arr.length;
  // // a1.repeatedNumber(arr);
  // int[] a = new int[] { 759, 752, 892, 304, 10, 305, 106, 557, 205, 292,
  // 362, 28, 756, 754, 872, 778, 178, 291,
  // 198, 331, 191, 616, 47, 625, 629, 853, 503, 425, 78, 408, 9, 39, 394,
  // 207, 427, 880, 223, 693, 492, 116,
  // 662, 80, 646, 626, 495, 763, 555, 286, 415, 100, 615, 447, 71, 500, 400,
  // 698, 873, 234, 765, 416, 262,
  // 535, 520, 218, 546, 649, 694, 818, 19, 654, 411, 368, 303, 845, 246, 856,
  // 37, 343, 221, 783, 601, 843,
  // 862, 848, 392, 341, 45, 846, 449, 714, 180, 877, 775, 465, 277, 204, 136,
  // 114, 552, 407, 437, 828, 607,
  // 316, 241, 813, 445, 232, 23, 94, 564, 915, 788, 379, 410, 202, 260, 426,
  // 691, 166, 404, 580, 637, 866,
  // 231, 904, 18, 239, 459, 901, 349, 281, 684, 52, 611, 361, 147, 167, 784,
  // 435, 732, 664, 677, 824, 139,
  // 203, 213, 130, 469, 530, 56, 852, 748, 377, 569, 364, 466, 736, 399, 902,
  // 482, 301, 851, 63, 254, 200,
  // 266, 830, 41, 14, 832, 668, 332, 159, 439, 484, 119, 758, 559, 310, 253,
  // 397, 859, 627, 806, 62, 622,
  // 146, 81, 2, 641, 51, 105, 390, 443, 740, 354, 558, 89, 263, 755, 386,
  // 638, 905, 378, 844, 315, 728, 706,
  // 43, 631, 645, 860, 817, 567, 501, 870, 99, 721, 553, 269, 151, 850, 750,
  // 280, 185, 184, 888, 526, 31,
  // 20, 32, 418, 236, 480, 460, 584, 735, 235, 140, 545, 518, 712, 797, 505,
  // 746, 50, 452, 602, 240, 247,
  // 572, 665, 893, 417, 376, 244, 803, 802, 76, 237, 704, 302, 723, 371, 4,
  // 102, 857, 798, 49, 762, 389, 83,
  // 667, 838, 887, 289, 620, 571, 760, 861, 471, 61, 713, 75, 346, 187, 233,
  // 592, 682, 95, 369, 181, 243,
  // 186, 895, 834, 800, 502, 161, 847, 885, 653, 430, 916, 488, 899, 816,
  // 249, 182, 458, 327, 841, 59, 676,
  // 491, 554, 659, 776, 17, 786, 671, 780, 468, 594, 849, 917, 908, 259, 716,
  // 890, 475, 60, 652, 82, 493,
  // 636, 85, 508, 812, 533, 536, 46, 689, 598, 444, 751, 34, 385, 576, 670,
  // 211, 73, 419, 455, 805, 563,
  // 162, 479, 477, 150, 282, 128, 779, 630, 320, 345, 423, 396, 11, 642, 53,
  // 272, 7, 579, 685, 539, 225,
  // 868, 322, 744, 323, 796, 174, 562, 473, 176, 278, 699, 839, 374, 842,
  // 148, 33, 414, 581, 27, 201, 494,
  // 504, 58, 506, 283, 647, 782, 296, 863, 25, 227, 129, 250, 522, 127, 42,
  // 311, 919, 382, 597, 661, 133,
  // 208, 574, 710, 226, 93, 69, 695, 328, 64, 511, 16, 920, 155, 101, 708,
  // 585, 36, 720, 450, 487, 799, 711,
  // 462, 697, 403, 729, 321, 342, 265, 317, 192, 701, 29, 384, 432, 894, 809,
  // 792, 734, 703, 658, 456, 299,
  // 295, 517, 855, 131, 854, 440, 810, 98, 790, 639, 612, 547, 586, 648, 229,
  // 193, 727, 312, 688, 92, 112,
  // 21, 333, 635, 833, 66, 113, 15, 194, 588, 773, 84, 318, 831, 772, 420,
  // 719, 380, 777, 604, 722, 135, 30,
  // 515, 358, 766, 442, 910, 428, 55, 804, 77, 308, 363, 457, 340, 789, 733,
  // 632, 700, 197, 214, 911, 261,
  // 134, 521, 807, 903, 336, 219, 398, 276, 715, 157, 548, 696, 216, 375,
  // 405, 768, 125, 413, 570, 669, 795,
  // 483, 245, 3, 168, 656, 217, 605, 730, 351, 441, 801, 835, 307, 827, 556,
  // 560, 583, 109, 785, 678, 406,
  // 900, 575, 96, 690, 724, 820, 867, 794, 747, 651, 8, 681, 692, 170, 525,
  // 884, 738, 623, 434, 542, 527,
  // 156, 891, 177, 808, 258, 814, 314, 454, 339, 673, 103, 921, 534, 881,
  // 165, 68, 122, 87, 359, 431, 115,
  // 918, 79, 914, 284, 412, 573, 190, 618, 883, 365, 344, 309, 516, 826, 530,
  // 485, 373, 188, 499, 290, 675,
  // 294, 220, 858, 357, 86, 209, 461, 875, 287, 864, 111, 663, 811, 549, 507,
  // 707, 561, 619, 350, 793, 672,
  // 5, 825, 242, 401, 822, 749, 634, 741, 297, 725, 913, 496, 256, 726, 215,
  // 171, 829, 121, 476, 108, 1,
  // 117, 149, 175, 324, 640, 657, 355, 298, 224, 273, 255, 153, 650, 12, 257,
  // 587, 26, 44, 118, 683, 230,
  // 300, 874, 628, 633, 391, 367, 774, 680, 513, 271, 643, 172, 666, 821,
  // 823, 179, 550, 463, 338, 787, 566,
  // 313, 599, 402, 565, 306, 909, 274, 13, 739, 679, 771, 453, 753, 486, 67,
  // 541, 285, 123, 577, 388, 144,
  // 293, 781, 764, 769, 621, 366, 383, 907, 124, 372, 72, 35, 173, 606, 519,
  // 451, 353, 54, 348, 617, 761,
  // 152, 137, 132, 836, 514, 409, 70, 370, 387, 524, 6, 88, 163, 160, 718,
  // 745, 472, 869, 40, 481, 248, 551,
  // 889, 898, 709, 886, 897, 268, 912, 154, 478, 538, 819, 467, 97, 644, 596,
  // 104, 251, 206, 145, 199, 878,
  // 319, 608, 497, 195, 737, 448, 529, 65, 582, 489, 57, 613, 490, 158, 600,
  // 252, 686, 438, 275, 393, 238,
  // 757, 624, 183, 589, 270, 267, 169, 326, 767, 815, 421, 352, 24, 578, 126,
  // 356, 687, 446, 544, 141, 865,
  // 436, 603, 532, 674, 429, 731, 91, 896, 90, 120, 196, 329, 360, 717, 660,
  // 591, 512, 593, 381, 325, 395,
  // 876, 212, 48, 424, 337, 610, 222, 334, 882, 906, 264, 509, 871, 702, 705,
  // 537, 189, 107, 474, 609, 743,
  // 543, 422, 138, 837, 330, 164, 433, 143, 498, 879, 22, 590, 528, 655, 210,
  // 288, 464, 742, 568, 228, 840,
  // 770, 510, 540, 347, 142, 470, 523, 335, 595, 279, 531, 110, 74, 614, 38
  // };
  // List<Integer> list1 = new ArrayList<>();
  // for (int i = 0; i < a.length; i++) {
  // list1.add(a[i]);
  // }
  //
  // List<Integer> inputList = new ArrayList<>();
  // inputList.add(1);
  // inputList.add(2);
  // inputList.add(3);
  // inputList.add(4);
  // inputList.add(3);
  // // List<Integer> result = a1.repeatedNumber(inputList);
  // // for (Integer object : result) {
  // // System.out.println(object);
  // // }
  //
  // List<Integer> result = a1.repeatedNumber(list1);
  // for (Integer object : result) {
  // System.out.println(object);
  // }

  // }

  private static long getSumOfnNumberSquare(int size) {
    long inputSize = (long) size;
    return (long) ((inputSize * (inputSize + 1) * (2 * inputSize + 1)) / 6);
  }

  public static void main(String[] args) {
    int[] a = new int[] {3, 2, -14, 2, 1, 3};
    int[] b = new int[] {3, 4, -1, 1};
    ArrayMath am = new ArrayMath();
    // int val = am.firstMissingPositive(a);
    int val2 = am.firstMissingPositive(b);
    // System.out.println(val);
    System.out.println(val2);
	}

	/**
	 * InterviewBit solution
	 *
	 * @param inputArray
	 * @return
	 */
    public ArrayList<Integer> plusOne_1(ArrayList<Integer> inputArray) {
      int zeroCounter = 0;
      while (zeroCounter < inputArray.size() && inputArray.get(zeroCounter) == 0)
        inputArray.remove(zeroCounter);

      int sum = 0, carry = 1;
      for (int i = inputArray.size() - 1; i >= 0; i--) {
        sum = inputArray.get(i) + carry;

        // set element
        inputArray.set(i, sum % 10);

        carry = sum / 10;

        // if carry == 0 means carry consumed
        if (carry == 0) {
          break;
        }
      }

      if (carry != 0)
        inputArray.add(0, carry);

      return inputArray;
    }

  // My solution for revision.
  public int maxSubArray(final List<Integer> arr) {
    int sum = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.size(); i++) {
      sum += arr.get(i);

      if (max < sum)
        max = sum;
      if (sum < 0)
        sum = 0;
    }
    return max;
  }

  /**
   * InterviewBit working solution this solution is from geeksforgeeks
   * intitially
	 *
	 * @param arr
	 * @return
   */
  // This solution is not yet consider for revision.
	public int[] repeatedNumber(final int[] arr) {
		int size = arr.length;
		int[] r = new int[2];

		int i;
      System.out.print("The repeating element is ");

		for (i = 0; i < size; i++) {
          if (arr[Math.abs(arr[i]) - 1] > 0) {
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
          } else {
				r[0] = Math.abs(arr[i]);

            System.out.println(Math.abs(arr[i]));
			}
        }

      System.out.print("And the missing element is ");
		for (i = 0; i < size; i++) {
			if (arr[i] > 0) {
				r[1] = i + 1;
              System.out.println(i + 1);
			}
		}
		return r;
    }

  /**
   * sum(nElements)(n) = sum(inputElemnt)(ma) + missingNumber(A) -
   * repeatedNumber(B) 1. sum(n) - sum(ma) = a-b
   * <p>
   * sum(n^2) = sum(ma^2) + a^2 + b^2 sum(n^2) - sum(ma^2) = a^2 + b^2
   * sum(n^2) - sum(ma^2) = (a+b)(a-b)
   * <p>
   * 2. (sum(n^2) - sum(ma^2) )/ (a-b)= (a+b)
   * <p>
   * (a+b) +(a-b) = their values sum 2a = their value sum 3. a = their value
   * sum/2 Found missing number 4. (a+b) = value from step 2 b = value from
   * step 2 -a Found repeated number
   */
  // MySolution
  public ArrayList<Integer> repeatedNumber(final List<Integer> input) {
    ArrayList<Integer> resultList = new ArrayList<>();

    long sumOfNNumbers = getSumOfN(input.size());
    long sumOfNSquare = getSumOfnNumberSquare(input.size());

    long sumOfInputArray = getSumOfInputArray(input);
    long sumOfInputArraySquare = getSumOfInputArraySquare(input);

    long diffOfAB = sumOfNNumbers - sumOfInputArray;
    long sumOfAB = (sumOfNSquare - sumOfInputArraySquare) / diffOfAB;

    int missingNumberA = (int) ((sumOfAB + diffOfAB) / 2);
    int repeatedNumberB = (int) sumOfAB - missingNumberA;

    System.out.println("Missing number is " + missingNumberA);
    System.out.println("Repeated number is " + repeatedNumberB);
    resultList.add(repeatedNumberB);
    resultList.add(missingNumberA);

    return resultList;
  }

  /**
   * Put each number in its right place. For example: When we find 5, then
   * swap it with A[4]. At last, the first place where its number is not
   * right, return the place + 1.
   *
   * @param A
   * @return
   */
  // My Solution from LeetCode https://leetcode.com/problems/first-missing-positive/discuss/17071
  public int firstMissingPositive(int A[]) {
    int n = A.length;
    for (int i = 0; i < n; i++) {
      while (A[i] > 0 && A[i] <= n && A[A[i] - 1] != A[i]) {
        swap(i, A[i] - 1, A);
      }
    }

    for (int i = 0; i < n; i++) {
      if (A[i] != i + 1) {
        return i + 1;
      }
    }

    return n + 1;
  }

  private void swap(int i, int j, int[] a) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  // My Solution
  public int findDuplicateInArray(final List<Integer> a) {
    int[] counts = new int[a.size()];

    for (int i = 0; i < a.size(); i++) {
      // if we've seen this integer already, the array will have 1
      if (counts[a.get(i)] == 1) {
        return a.get(i);
      } else {
        counts[a.get(i)]++;
      }
    }

    return -1;
  }

  /**
   * InterviewBit
   *
   * @param nums
   * @return
   */
  public int majorityElemnt(final List<Integer> nums) {
    int len = nums.size();

    int num1 = nums.get(0);
    int num2 = nums.get(1);
    int count1 = 1;
    int count2 = 0;

    for (int val : nums) {
      if (val == num1) {
        count1++;
      } else if (val == num2) {
        count2++;
      } else if (count1 == 0) {
        num1 = val;
        count1++;
      } else if (count2 == 0) {
        num2 = val;
        count2++;
      } else {
        count1--;
        count2--;
      }
    }
    count1 = 0;
    count2 = 0;
    for (int val : nums) {
      if (val == num1) {
        count1++;
      } else if (val == num2) {
        count2++;
      }
    }
    if (count1 > len / 3) {
      return num1;
    } else if (count2 > len / 3) {
      return num2;
    }

    return -1;
  }

  public int repeatedNumber_1(final List<Integer> a) {
    int len = a.size();

    if (a.size() == 0) {
      return -1;
    }

    if (a.size() == 1) {
      return a.get(0);
    }

    int c1 = a.get(0);
    int c2 = a.get(1);
    int c1count = 0;
    int c2count = 0;

    for (int num : a) {
      if (c1 == num) {
        c1count++;
      } else if (c2 == num) {
        c2count++;
      } else if (c1count == 0) {
        c1 = num;
        c1count = 1;
      } else if (c2count == 0) {
        c2 = num;
        c2count = 1;
      } else {
        c1count--;
        c2count--;
      }
    }

    c1count = 0;
    c2count = 0;
    for (int num : a) {
      if (c1 == num) {
        c1count++;
      } else if (num == c2) {
        c2count++;
      }
    }

    if (c1count > len / 3) {
      return c1;
    } else if (c2count > len / 3) {
      return c2;
    } else {
      return -1;
    }

  }

  // My Revision Solution for Rotate Matrix

  //https://leetcode.com/problems/rotate-image/discuss/18872
  /*
   * clockwise rotate
   * first reverse up to down, then swap the symmetry
   * 1 2 3     7 8 9     7 4 1
   * 4 5 6  => 4 5 6  => 8 5 2
   * 7 8 9     1 2 3     9 6 3
   */
  //  swap(matrix[i][j], matrix[j][i]);
  void rotate(ArrayList<ArrayList<Integer>> matrix) {
    Collections.reverse(matrix);
    for (int i = 0; i < matrix.size(); ++i) {
      for (int j = i + 1; j < matrix.get(i).size(); ++j) {
        swap(i, j, matrix);
      }
    }
  }

  private void swap(int i, int j, ArrayList<ArrayList<Integer>> list) {
    int temp = list.get(i).get(j);
    list.get(i).set(j, list.get(j).get(i));
    list.get(j).set(i, temp);
  }


  // My Revision solution
  public ArrayList<Integer> wave(ArrayList<Integer> A) {
    Collections.sort(A);
    for (int i = 0; i < A.size() - 1; i = i + 2) {
      int temp = A.get(i);
      A.set(i, A.get(i + 1));
      A.set(i + 1, temp);
    }
    return A;
  }

  /*
   * anticlockwise rotate
   * first reverse left to right, then swap the symmetry
   * 1 2 3     3 2 1     3 6 9
   * 4 5 6  => 6 5 4  => 2 5 8
   * 7 8 9     9 8 7     1 4 7
   */
//	void anti_rotate(vector<vector<int> > &matrix) {
//	    for (auto vi : matrix) reverse(vi.begin(), vi.end());
//	    for (int i = 0; i < matrix.size(); ++i) {
//	        for (int j = i + 1; j < matrix[i].size(); ++j)
//	            swap(matrix[i][j], matrix[j][i]);
//	    }
//	}


}
