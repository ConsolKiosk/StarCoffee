# ★STARCOFFEE 에 오신것을 환영합니다★

## ☕️ 팀 소개
### [Notion 주소]
#### <https://www.notion.so/b84485202d01447cb3b108f884851037>

### [팀원 소개]
| 이 름 | 역할 | 개인 Github 주소           |
| ------ | --- | ---------------------------- |
| 김소현 | 팀장 | <https://github.com/sinw212> |
| 남경화 | 팀원 | <https://github.com/KyungHwa0> |
| 나유성 | 팀원 | <https://github.com/VonLyus> |
| 전지성 | 팀원 | <https://github.com/PMETNT> |
| 조광희 | 팀원 | <https://github.com/ckh124> |

---
## 📌 프로젝트 소개 - Consol 창 키오스크 만들기
### [메뉴 소개]
| Menu | Category |
| ----- | ------------------------------ |
| Drink | Coffee, Blended, Frappuccino, Ade |
| Food | Cake, Bread, Sandwich |
| MD | Mug, Thumbler, VIA, ACC |

### [기능 및 고려 조건]
- 클래스 설계 및 클래스 간 상속 관계 형성
- 음료/푸드/상품 별 카테고리 및 항목 선택
- 전 단계 뒤로가기 기능
- 입력 값 예외처리
- 음료 Ice/Hot 선택 및 Size 선택 기능
- 장바구니 기능 (계산 확정 여부 확인)
  - 장바구니 전 항목 계산 기능
  - 잔액 부족 시, 결제 불가 예외처리
- 결제 운영 시간 제한 기능
- 5초마다 주문 대기수 실시간 출력 (코루틴 활용)
- 주문 완료 3초 후 MainThread 수행 (코루틴 활용)
  - Activity가 없는 프로젝트 특성 상, runBlocking 함수 사용하여 강제대기
  
