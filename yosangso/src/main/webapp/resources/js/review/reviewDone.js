console.log("되나");
//===========================================================================================================

// 리뷰 삭제하기 누르면 알림창 띄우고 리다이렉트 시키는 함수
function reviewDelete(){
    swal('리뷰 삭제 완료!', '리뷰가 삭제되었어요! :-) ', 'success')
    .then(function(){
        // location.href="reviewDoneList";                   
    })
}

//===========================================================================================================