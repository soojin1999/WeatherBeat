import { useEffect, useState } from 'react'
import axios from 'axios'

function App() {
  const [message, setMessage] = useState('백엔드 연결 대기 중2...')

  useEffect(() => {
    // Spring Boot 서버가 8080포트에서 실행 중이어야 합니다.
    axios.get('http://localhost:8080/api/hello')
      .then(res => {
        setMessage(res.data)
      })
      .catch(err => {
        console.error("연동 실패:", err)
        setMessage("백엔드 서버를 확인하세요!")
      })
  }, [])

  return (
    <div style={{
      display: 'flex',
      height: '100vh',
      alignItems: 'center',
      justifyContent: 'center',
      backgroundColor: '#f0f4f8',
      fontFamily: 'sans-serif'
    }}>
      <div style={{
        padding: '2rem',
        backgroundColor: 'white',
        borderRadius: '12px',
        boxShadow: '0 4px 6px rgba(0,0,0,0.1)'
      }}>
        <h1 style={{ color: '#2563eb' }}>{message}</h1>
        <p>WeatherBeat 프로젝트 연동 테스트 중</p>
      </div>
    </div>
  )
}

export default App