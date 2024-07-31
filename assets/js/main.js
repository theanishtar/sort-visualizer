document.addEventListener('DOMContentLoaded', () => {

  const columns = document.querySelectorAll('.column');
  let firstSelectedColumn = null;
  let secondSelectedColumn = null;

  // function swapColumns(column1, column2) {

  //   column1.style.border = '2px solid red'; // Highlight the first selected column
  //   column2.style.border = '2px solid red'; // Highlight the first selected column
  //   const col1InitialLeft = column1.offsetLeft;
  //   const col2InitialLeft = column2.offsetLeft;

  //   // Animate the swap
  //   column1.style.transition = 'transform 1s';
  //   column2.style.transition = 'transform 1s';

  //   column1.style.transform = `translateX(${col2InitialLeft - col1InitialLeft}px)`;
  //   column2.style.transform = `translateX(${col1InitialLeft - col2InitialLeft}px)`;

  //   setTimeout(() => {
  //     // Reset transform after animation
  //     column1.style.transition = '';
  //     column2.style.transition = '';
  //     column1.style.transform = '';
  //     column2.style.transform = '';

  //     // Swap positions in the DOM
  //     const col1NextSibling = column1.nextSibling;
  //     const col2NextSibling = column2.nextSibling;
  //     const parent = column1.parentNode;

  //     parent.insertBefore(column2, col1NextSibling);
  //     parent.insertBefore(column1, col2NextSibling);


  //     column1.style.border = ''; // Highlight the first selected column
  //     column2.style.border = ''; // Highlight the first selected column
  //   }, 1000);
  // }
  // function swapColumns(column1, column2) {
  //   const col1InitialLeft = column1.offsetLeft;
  //   const col2InitialLeft = column2.offsetLeft;

  //   // Thêm transition và transform để thực hiện hiệu ứng di chuyển
  //   column1.style.transition = 'transform 1s';
  //   column2.style.transition = 'transform 1s';

  //   column1.style.transform = `translateX(${col2InitialLeft - col1InitialLeft}px)`;
  //   column2.style.transform = `translateX(${col1InitialLeft - col2InitialLeft}px)`;

  //   // Sử dụng transitionend để xác định khi hiệu ứng kết thúc
  //   const handleTransitionEnd = () => {
  //     // Gỡ bỏ các transition và transform sau khi hiệu ứng kết thúc
  //     column1.style.transition = '';
  //     column2.style.transition = '';
  //     column1.style.transform = '';
  //     column2.style.transform = '';

  //     // Hoán đổi vị trí trong DOM
  //     const col1NextSibling = column1.nextSibling;
  //     const col2NextSibling = column2.nextSibling;
  //     const parent = column1.parentNode;

  //     parent.insertBefore(column2, col1NextSibling);
  //     parent.insertBefore(column1, col2NextSibling);

  //     // Xóa các border sau khi hoàn tất hoán đổi
  //     column1.style.border = '';
  //     column2.style.border = '';

  //     // Gỡ bỏ sự kiện để tránh lắng nghe nhiều lần
  //     column1.removeEventListener('transitionend', handleTransitionEnd);
  //     column2.removeEventListener('transitionend', handleTransitionEnd);
  //   };

  //   // Thêm sự kiện transitionend vào các cột
  //   column1.addEventListener('transitionend', handleTransitionEnd, { once: true });
  //   column2.addEventListener('transitionend', handleTransitionEnd, { once: true });
  // }


  function swapColumns(column1, column2) {
    const col1InitialLeft = column1.offsetLeft;
    const col2InitialLeft = column2.offsetLeft;

    // Đảm bảo DOM được cập nhật trước khi bắt đầu hiệu ứng
    requestAnimationFrame(() => {
      // Thêm transition và transform để thực hiện hiệu ứng di chuyển
      column1.style.transition = 'transform 1s';
      column2.style.transition = 'transform 1s';

      column1.style.transform = `translateX(${col2InitialLeft - col1InitialLeft}px)`;
      column2.style.transform = `translateX(${col1InitialLeft - col2InitialLeft}px)`;

      // Sử dụng transitionend để xác định khi hiệu ứng kết thúc
      const handleTransitionEnd = () => {
        // Hoán đổi vị trí trong DOM
        const col1NextSibling = column1.nextSibling;
        const col2NextSibling = column2.nextSibling;
        const parent = column1.parentNode;

        parent.insertBefore(column2, col1NextSibling);
        parent.insertBefore(column1, col2NextSibling);

        // Gỡ bỏ các transition và transform sau khi hiệu ứng kết thúc
        column1.style.transition = '';
        column2.style.transition = '';
        column1.style.transform = '';
        column2.style.transform = '';

        // Gỡ bỏ sự kiện để tránh lắng nghe nhiều lần
        column1.removeEventListener('transitionend', handleTransitionEnd);
        column2.removeEventListener('transitionend', handleTransitionEnd);
      };

      // Thêm sự kiện transitionend vào các cột
      column1.addEventListener('transitionend', handleTransitionEnd, { once: true });
      column2.addEventListener('transitionend', handleTransitionEnd, { once: true });
    });
  }



  function handleColumnClick(column) {
    if (firstSelectedColumn === null) {
      // Select the first column
      firstSelectedColumn = column;
      column.style.border = '2px solid red'; // Highlight the first selected column
    }
    if (secondSelectedColumn === null && column !== firstSelectedColumn) {
      // Select the second column and swap
      secondSelectedColumn = column;
      column.style.border = '2px solid red'; // Highlight the first selected column
      swapColumns(firstSelectedColumn, secondSelectedColumn);

      firstSelectedColumn = null; // Reset selection
      secondSelectedColumn = null; // Reset selection
    }
  }

  columns.forEach(column => {
    column.addEventListener('click', () => handleColumnClick(column));
  });

});

const toTop = function (colL, colR) {
  const hColL = document.querySelector(`#${colL}`);
  const hColR = document.querySelector(`#${colR}`);
}
