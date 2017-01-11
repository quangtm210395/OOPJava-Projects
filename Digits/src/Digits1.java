/*
 * Cách giải bài toán tách chữ số :
 *
 * Tổng quát: Giả sử số đã cho là abcde (với a, b, c, d, e là các số 0-9; a!=0)
 * 		      (Ta cần tách ra : a, b, c, d, e)
 * Cơ sở :
 * 		abcde = abcd*10 + e
 * 			-> e là phần dư của phép chia abcde cho 10
 * 			-> abcd là phần nguyên của phép chia abcde cho 10
 *
 * 		Để lấy số cuối của một số ta lấy kết quả phần dư của phép chia số đó cho 10
 * 		Để loại bỏ số cuối, ta lấy số đó chia 10 và lấy phần nguyên.
 * 		Cho đến khi nào phép chia nhận được phần nguyên là 0 thì ko phải tách nữa.
 *
 * Các bước thực hiện :
 *
 * B1 : Tạo 1 mảng để lưu giá trị các chữ số của biến soNguyen
 * B2 : Lấy soNguyen chia cho 10, lấy phần dư đưa vào mảng đã tạo ở B1
 * B3 : Lấy phần nguyên của phép chia soNguyen/10 gán cho soNguyen
 * B4 : Nếu soNguyen>0 thực hiện lại bước 2, nếu không chuyển sang B5
 * B5 : Đảo ngược lại mảng thu được và in ra màn hình
 *
 */

public class Digits1 {
	public static void main(String[] args) {

		int soNguyen = 153426;

		int[] digit = new int[20];	// Mảng lưu các chữ số.
		int count = 0;				// Đếm độ số lượng các chữ số.

        if(soNguyen==0){ // Xét riêng trường hợp = 0
            System.out.println(0);
        }else{
            while(soNguyen>0){
                count++;
                digit[count] = soNguyen % 10; // Lấy số cuối .
                soNguyen = soNguyen / 10;	  // Cắt bỏ số cuối.
            }

            /* Đảo ngược lại mảng tìm được và in ra màn hình */
            for (int i = count; i >0; i--) {
                System.out.println(digit[i]);
            }
        }

	}
}
