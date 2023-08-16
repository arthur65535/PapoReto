import React from 'react'
import Login from './login'

import DashBoard from "./DashBoard";

import useLocalStorage from "../hooks/useLocalStorage";

function App() {
  const [id, setId] = useLocalStorage('id')

  return (
      id ? <DashBoard id={id}/> : <Login onIdSubmit={setId}/>
  )
}

export default App;
