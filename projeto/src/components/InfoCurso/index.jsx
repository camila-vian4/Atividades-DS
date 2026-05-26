import { useState } from 'react'
import './style.css'

export default function InfoCurso() {
    const [nome, setNome] = useState('Lógica de Programação')
    const [cargaHoraria, setCargaHoraria] = useState(162)
    const [dataInicio, setDataInicio] = useState('03/02/2025')
    const [dataTermino, setDataTermino] = useState('03/02/2026')
    const [turno, setTurno] = useState('NOTURNO')
    const [vagas, setVagas] = useState(20)

    return (
        <div className='info-curso'>
            <h2>Dados do curso:</h2>
            <p>Nome: { nome }</p>
            <p>Carga horária: { cargaHoraria }</p>
            <p>Data de início: { dataInicio }</p>
            <p>Data de término: { dataTermino }</p>
            <p>Turno: { turno }</p>
            <p>Vagas: { vagas }</p>
        </div>
    )
}