    import { useEffect, useState } from 'react';
    import './App.css';

    function App() {
      const [members, setMembers] = useState([]);

      useEffect(() => {
        fetch('/api/members') // 백엔드에서 데이터 받아오기
          .then(response => response.json())
          .then(data => {
                console.log(data);
                setMembers(data);
          }) // 받아온 리스트를 상태에 저장
          .catch(error => console.error('에러 발생:', error));
      }, []);

      return (
        <div className="App">
          <h1>멤버 목록</h1>
          <ul>
            {members.map((name, index) => (
              <li key={index}>{name}</li>
            ))}
          </ul>
        </div>
      );
    }

    export default App;
