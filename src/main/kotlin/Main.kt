/**
 * 문서 용도의 주석은 슬래쉬와 아스테리스크 두 개를 파일의 최상단 위치에서 내부 내용을 설명하는 용도로 사용할 수 있다.
 */

/*
  여러 줄의 주석은 슬래쉬와 아스테리스크로 만들 수 있다.
 */
// 한 줄짜리 주석은 슬래쉬 두번이면 된다.


fun main(args: Array<String>) {
    println("안녕하세요, Shoppi에 오신 것을 환영합니다!")
    println("쇼핑을 계속 하시려면 이름을 입력해줘잉")

    val name = readLine()
    println(
        """
        감사합니다. 반갑습니다, $name 님
        원하시는 카테고리를 입력해주세요.
        ***=======================================***
    """.trimIndent()
    )

    val categories = arrayOf("패션", "전자기기", "반려동물용품")
    for (category in categories) {
        println(category)
    }
    println("=> 장바구니로 이동하시려면 #을 입력해주세요")

    var selectedCategory = readLine()
    while (selectedCategory.isNullOrBlank()) {
        println("값을 입력해주세요")
        selectedCategory = readLine()
    }
    if (selectedCategory == "#") {
        // TODO 1. 장바구니로 이동하도록 설정
    } else {
        // TODO 2. 카테고리 상품 목록 보여주기
        // TODO 3. 목록에 없는 값을 입력한 경우.
    }
}