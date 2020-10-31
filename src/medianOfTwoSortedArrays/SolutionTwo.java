package medianOfTwoSortedArrays;

public class SolutionTwo {
    static int getMedian(int nums1[], int nums2[], int n)
    {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;

        /* Since there are 2n elements, median will
           be average of elements at index n-1 and
           n in the array obtained after merging nums1
           and nums2 */
        for (count = 0; count <= n; count++)
        {
            /* Below is to handle case where all
              elements of nums1[] are smaller than
              smallest(or first) element of nums2[] */
            if (i == n)
            {
                m1 = m2;
                m2 = nums2[0];
                break;
            }

            /* Below is to handle case where all
               elements of nums2[] are smaller than
               smallest(or first) element of nums1[] */
            else if (j == n)
            {
                m1 = m2;
                m2 = nums1[0];
                break;
            }
            /* equals sign because if two
               arrays have some common elements */
            if (nums1[i] <= nums2[j])
            {
                /* Store the prev median */
                m1 = m2;
                m2 = nums1[i];
                i++;
            }
            else
            {
                /* Store the prev median */
                m1 = m2;
                m2 = nums2[j];
                j++;
            }
        }

        return (m1 + m2)/2;
    }

    /* Driver program to test above function */
    public static void main (String[] args)
    {
        int ar1[] = {1, 12, 15, 26, 38};
        int ar2[] = {2, 13, 17, 30, 45};

        int n1 = ar1.length;
        int n2 = ar2.length;
        if (n1 == n2)
            System.out.println("Median is " +
                    getMedian(ar1, ar2, n1));
        else
            System.out.println("arrays are of unequal size");
    }
}

