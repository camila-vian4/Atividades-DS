import './App.css'
import HomePage from './pages/HomePage'
import CadastroPage from './pages/CadastroPage'
import ListaPage from './pages/ListaPage'
import Header from './components/Header'
import Footer from './components/Footer'
import { Routes } from 'react-router-dom'
import { ToastContainer } from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'


function App() {
  return (
    <>
    <Header/>
    <main>
      <Routes path="/" element={<HomePage />} />
      <Routes path="/cadastro" element={<CadastroPage />} />
      <Routes path="/lista" element={<ListaPage />} />
    </main>
    <ToastContainer position="bottom-right" autoClose={3000} />
    <Footer/>
    </>

  )
}

export default App
