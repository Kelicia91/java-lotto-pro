# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 목록
- lotto number
  - validate 1~45
- lotto
  - price = 1000 
  - generate distinct 6 lotto numbers
  - has bonus
- lotto store
  - sell lottos (pay, manual lottos)
- lotto parser
- winning lotto (extends lotto)
  - count matching
  - bonus
- lotto winning rank
- lotto winning statistics
  - count lottos by rank
  - calculate earnings-rate
- view
  - input
    - pay : should be bigger than price of lotto, otherwise retry
    - number of lottos(n) to buy manually
    - lottos to buy manually
    - winning numbers (','구분)
    - winning bonus
  - output
    - lottos (auto, manually)
    - winning statistics
    - error
- app
