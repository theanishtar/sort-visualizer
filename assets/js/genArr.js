const min = 10; // Minimum value (inclusive)
const max = 50; // Maximum value (inclusive)
let arrRoot = 0;

function delay(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

const genRandom = function (n) {
  return Array.from({ length: n }, () => Math.floor(Math.random() * (max - min + 1)) + min);
}

const genCol = function (id, val) {
  let borderStyle = id;
  if (borderStyle > 9)
    borderStyle = borderStyle - 9;
  return (
    `
    <div class="parent">
      <div class="column column${borderStyle} " id="col${id}" style="height: ${val * 10}px;" value="${val}">
        <!-- <p class="value">${val}</p> -->
        ${val}
      </div>
    </div>
    `);
}

const genIndex = function (val) {
  return `<div class="index-item id${val}">${val}</div>`;
}

const genLetter = function (id) {
  return `<div class="letter-item letter${id}"></div>`;
}

const genNumeral = function (id) {
  return `<div class="numerals-item numeral${id}"></div>`;
}

const genMaps = function (n) {
  const index = document.querySelector('#indexs');
  const container = document.querySelector('#columns');
  const letter = document.querySelector('#letters');
  const numeral = document.querySelector('#numerals');

  const arr = genRandom(n);
  console.log(arr)
  arrRoot = arr;
  let columnsHTML = '';
  let indexsHTML = '';
  let lettersHTML = '';
  let numeralsHTML = '';
  for (let i = 0; i < arr.length; i++) {
    const colHTML = genCol(i, arr[i]);
    const indexHTML = genIndex(i);
    const letterHTML = genLetter(i);
    const numeralHTML = genNumeral(i);
    columnsHTML += colHTML;
    indexsHTML += indexHTML;
    lettersHTML += letterHTML;
    numeralsHTML += numeralHTML;
  }
  container.innerHTML = columnsHTML;
  index.innerHTML = indexsHTML;
  letter.innerHTML = lettersHTML;
  numeral.innerHTML = numeralsHTML;
}


//sort

document.addEventListener('DOMContentLoaded', () => {
  const columns = document.querySelectorAll('.column');

  const simulation = async function (arr) {
    const n = arr.length;

    // Lặp qua từng phần tử trong mảng
    for (let i = 0; i < n - 1; i++) {
      // So sánh phần tử hiện tại với các phần tử phía sau
      for (let j = i + 1; j < n; j++) {

        const colI = document.getElementById(`col${i}`);
        // alert(`col${i} - col${j}`)
        const colJ = document.getElementById(`col${j}`);
        colI.style.border = '2px solid red';
        colJ.style.border = '2px solid red';
        await delay(500);
        if (arr[j] < arr[i]) {
          colI.style.border = '2px solid green';
          colJ.style.border = '2px solid green';
          // Hoán đổi nếu phần tử hiện tại lớn hơn phần tử phía sau
          swapColumns(colI, colJ);
          await delay(1000);
          const temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          // return;
        }

        // Xóa các border sau khi hoàn tất hoán đổi
        colI.style.border = '';
        colJ.style.border = '';
      }
    }
  }

  async function swapColumns(column1, column2) {
    const col1InitialLeft = column1.offsetLeft;
    const col2InitialLeft = column2.offsetLeft;

    // Thêm transition và transform để thực hiện hiệu ứng di chuyển
    column1.style.transition = 'transform 1s';
    column2.style.transition = 'transform 1s';

    column1.style.transform = `translateX(${col2InitialLeft - col1InitialLeft}px)`;
    column2.style.transform = `translateX(${col1InitialLeft - col2InitialLeft}px)`;

    // Sử dụng transitionend để xác định khi hiệu ứng kết thúc
    const handleTransitionEnd = () => {
      // Gỡ bỏ các transition và transform sau khi hiệu ứng kết thúc
      column1.style.transition = '';
      column2.style.transition = '';
      column1.style.transform = '';
      column2.style.transform = '';

      // // Hoán đổi vị trí trong DOM
      const height1 = column1.style.height;
      const height2 = column2.style.height;

      const content1 = column1.textContent;
      const content2 = column2.textContent;

      column1.style.height = height2;
      column2.style.height = height1;
      column1.textContent = content2;
      column2.textContent = content1;

      // Gỡ bỏ sự kiện để tránh lắng nghe nhiều lần
      column1.removeEventListener('transitionend', handleTransitionEnd);
      column2.removeEventListener('transitionend', handleTransitionEnd);
    };

    // Thêm sự kiện transitionend vào các cột
    column1.addEventListener('transitionend', handleTransitionEnd, { once: true });
    column2.addEventListener('transitionend', handleTransitionEnd, { once: true });
  }

  document.getElementById('sort').addEventListener('click', () => {
    simulation(arrRoot);
  });
});

