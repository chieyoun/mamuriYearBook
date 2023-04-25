# 마무리

날짜: 2023년 3월 13일 → 2023년 7월 16일
<br>

<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white">
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white">
<img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white">
<br>

# 📊프로젝트 개요

## 목표

⭐ 실제 졸업 앨범을 잃어버리거나 훼손되어도 볼 수 있게 온라인으로 졸업 앨범을 구현
<br>
⭐ 사용자가 계속해서 연락처를 수정할 수 있게 하여 동창과의 연결을 끊기지 않게 함

## 문제 정의

<aside>
💬 학교 동창이어도 졸업 앨범에 적힌 연락처가 바뀌면 연락을 하기 힘들어짐.

</aside>

# ✅프로젝트 세부 사항

## 주 고객층

- 학교를 다닌 적 있는 사람.
- 옛 친구와 연락이 끊긴 사람.

## 페이지

### 🏫 학교 학급

### 👤 개인 프로필

> 🏫 학교 학급
> 
> - 다녔던 학교 선택(초, 중, 고, 대)
> - 앨범 (단체사진)
> - 공지( 동창회, 모임, 교류회 등)
> - 검색(학생)

### 🔤 계정 관리

> 🔤 계정 관리
> 
> - 로그인
> - 회원가입
> - 계정 삭제

> 👤 개인 프로필
> 
> - 개인 정보 
> (증명사진, 연락처, 나이, 학교 정보)
> - 생명 활동중(사망 혹은 실종 시 회색불)
> 

### ⚙️ 기타

> ⚙️ 기타
> 
> - 기능 제안(오류 정보)
> - 설정

## 일정
 <style>
  body {
  font-family: Tahoma;
}
header {
  text-align: center;
}
#calendar {
  width: 100%;
}
#calendar a {
  color: #8e352e;
  text-decoration: none;
}
#calendar ul {
  list-style: none;
  padding: 0;
  margin: 0;
  width: 100%;
}
#calendar li {
  display: block;
  float: left;
  width: 14.342%;
  padding: 5px;
  box-sizing: border-box;
  border: 1px solid #ccc;
  margin-right: -1px;
  margin-bottom: -1px;
}
#calendar ul.weekdays {
  height: 40px;
  background: #8e352e;
}
#calendar ul.weekdays li {
  text-align: center;
  text-transform: uppercase;
  line-height: 20px;
  border: none !important;
  padding: 10px 6px;
  color: #fff;
  font-size: 13px;
}
#calendar .days li {
  height: 180px;
}
#calendar .days li:hover {
  background: #d3d3d3;
}
#calendar .date {
  text-align: center;
  margin-bottom: 5px;
  padding: 4px;
  background: #333;
  color: #fff;
  width: 20px;
  border-radius: 50%;
  float: right;
}
#calendar .event {
  clear: both;
  display: block;
  font-size: 13px;
  border-radius: 4px;
  padding: 5px;
  margin-top: 40px;
  margin-bottom: 5px;
  line-height: 14px;
  background: #e4f2f2;
  border: 1px solid #b5dbdc;
  color: #009aaf;
  text-decoration: none;
}
#calendar .event-desc {
  color: #666;
  margin: 3px 0 7px 0;
  text-decoration: none;
}
#calendar .other-month {
  background: #f5f5f5;
  color: #666;
}
/* ============================
                Mobile Responsiveness
   ============================*/
@media (max-width: 768px) {
  #calendar .weekdays, #calendar .other-month {
    display: none;
  }
  #calendar li {
    height: auto !important;
    border: 1px solid #ededed;
    width: 100%;
    padding: 10px;
    margin-bottom: -1px;
  }
  #calendar .date {
    float: none;
  }
}
</style>
<div id="calendar-wrap">
            <header>
                <h1>August 2014</h1>
            </header>
            <div id="calendar">
                <ul class="weekdays">
                    <li>Sunday</li>
                    <li>Monday</li>
                    <li>Tuesday</li>
                    <li>Wednesday</li>
                    <li>Thursday</li>
                    <li>Friday</li>
                    <li>Saturday</li>
                </ul>
                <!-- Days from previous month -->
                <ul class="days">
                    <li class="day other-month">
                        <div class="date">27</div>                     
                    </li>
                    <li class="day other-month">
                        <div class="date">28</div>
                        <div class="event">
                            <div class="event-desc">
                                HTML 5 lecture with Brad Traversy from Eduonix
                            </div>
                            <div class="event-time">
                                1:00pm to 3:00pm
                            </div>
                        </div>                     
                    </li>
                    <li class="day other-month">
                        <div class="date">29</div>                     
                    </li>
                    <li class="day other-month">
                        <div class="date">30</div>                     
                    </li>
                    <li class="day other-month">
                        <div class="date">31</div>                     
                    </li>
                    <!-- Days in current month -->
                    <li class="day">
                        <div class="date">1</div>                      
                    </li>
                    <li class="day">
                        <div class="date">2</div>
                        <div class="event">
                            <div class="event-desc">
                                Career development @ Community College room #402
                            </div>
                            <div class="event-time">
                                2:00pm to 5:00pm
                            </div>
                        </div>                     
                    </li>
                </ul>
                    <!-- Row #2 -->
                <ul class="days">
                    <li class="day">
                        <div class="date">3</div>                      
                    </li>
                    <li class="day">
                        <div class="date">4</div>                      
                    </li>
                    <li class="day">
                        <div class="date">5</div>                      
                    </li>
                    <li class="day">
                        <div class="date">6</div>                      
                    </li>
                    <li class="day">
                        <div class="date">7</div>
                        <div class="event">
                            <div class="event-desc">
                                Group Project meetup
                            </div>
                            <div class="event-time">
                                6:00pm to 8:30pm
                            </div>
                        </div>                     
                    </li>
                    <li class="day">
                        <div class="date">8</div>                      
                    </li>
                    <li class="day">
                        <div class="date">9</div>                      
                    </li>
                </ul>
                    <!-- Row #3 -->
                <ul class="days">
                    <li class="day">
                        <div class="date">10</div>                     
                    </li>
                    <li class="day">
                        <div class="date">11</div>                     
                    </li>
                    <li class="day">
                        <div class="date">12</div>                     
                    </li>
                    <li class="day">
                        <div class="date">13</div>                     
                    </li>
                    <li class="day">
                        <div class="date">14</div><div class="event">
                            <div class="event-desc">
                                Board Meeting
                            </div>
                            <div class="event-time">
                                1:00pm to 3:00pm
                            </div>
                        </div>                     
                    </li>
                    <li class="day">
                        <div class="date">15</div>                     
                    </li>
                    <li class="day">
                        <div class="date">16</div>                     
                    </li>
                </ul>
                    <!-- Row #4 -->
                <ul class="days">
                    <li class="day">
                        <div class="date">17</div>                     
                    </li>
                    <li class="day">
                        <div class="date">18</div>                     
                    </li>
                    <li class="day">
                        <div class="date">19</div>                     
                    </li>
                    <li class="day">
                        <div class="date">20</div>                     
                    </li>
                    <li class="day">
                        <div class="date">21</div>                     
                    </li>
                    <li class="day">
                        <div class="date">22</div>
                        <div class="event">
                            <div class="event-desc">
                                Conference call
                            </div>
                            <div class="event-time">
                                9:00am to 12:00pm
                            </div>
                        </div>                     
                    </li>
                    <li class="day">
                        <div class="date">23</div>                     
                    </li>
                </ul>
                        <!-- Row #5 -->
                <ul class="days">
                    <li class="day">
                        <div class="date">24</div>                     
                    </li>
                    <li class="day">
                        <div class="date">25</div>
                        <div class="event">
                            <div class="event-desc">
                                Conference Call
                            </div>
                            <div class="event-time">
                                1:00pm to 3:00pm
                            </div>
                        </div>                     
                    </li>
                    <li class="day">
                        <div class="date">26</div>                     
                    </li>
                    <li class="day">
                        <div class="date">27</div>                     
                    </li>
                    <li class="day">
                        <div class="date">28</div>                     
                    </li>
                    <li class="day">
                        <div class="date">29</div>                     
                    </li>
                    <li class="day">
                        <div class="date">30</div>                     
                    </li>
                </ul>
                <!-- Row #6 -->
                <ul class="days">
                    <li class="day">
                        <div class="date">31</div>                     
                    </li>
                    <li class="day other-month">
                        <div class="date">1</div> <!-- Next Month -->                      
                    </li>
                    <li class="day other-month">
                        <div class="date">2</div>                      
                    </li>
                    <li class="day other-month">
                        <div class="date">3</div>                      
                    </li>
                    <li class="day other-month">
                        <div class="date">4</div>                      
                    </li>
                    <li class="day other-month">
                        <div class="date">5</div>                      
                    </li>
                    <li class="day other-month">
                        <div class="date">6</div>                      
                    </li>
                </ul>
            </div><!-- /. calendar -->
        </div><!-- /. wrap -->
[마무리](https://www.notion.so/206faced33874b8fb06186e1e44cc35d)
