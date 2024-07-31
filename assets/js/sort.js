function interchangeSort(arr) {
  const n = arr.length;

  // Lặp qua từng phần tử trong mảng
  for (let i = 0; i < n - 1; i++) {
    // So sánh phần tử hiện tại với các phần tử phía sau
    for (let j = i + 1; j < n; j++) {
      if (arr[j] < arr[i]) {
        // Hoán đổi nếu phần tử hiện tại lớn hơn phần tử phía sau
        const temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
  return arr;
}



