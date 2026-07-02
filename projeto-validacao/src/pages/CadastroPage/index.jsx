import { toast } from 'react-toastify'
import './style.css'
import * as yup from 'yup'
import { yupResolver } from '@hookform/resolvers/yup'
import { useForm } from 'react-hook-form'
import api from '../../services/api'

// Validação de formulário
const esquemaDeCadastro = yup.object().shape({
    nome: yup.string().required('O nome é obrigatório'),
    email: yup.string().email('Digite um e-mail válido').required('O e-mail é obrigatório'),
    senha: yup.string().min(6, 'A senha deve ter no mínimo 6 caracteres').required('A senha é obrigatória'),
    confirmarSenha: yupResolver.string().oneOf([yupResolver.ref('senha'), null], 'As senhas devem ser iguais').required('A confirmação de senha é obrigatória'),
})

export default function CadastroPage() {
    
    const {
        register: registrarCampo,
        handleSubmit: manipularEnvio,
        formState: { errors: errosDeValidacao, isSubmitting: estaEnviando },
        setError: definirErro,
        reset: reiniciarFormulario
    } = useForm({
        resolver: yupResolver(esquemaDeCadastro),
        defaultValues: {
            nome: '',
            email: '',
            senha: '',
            confirmarSenha: '',
        }
    })

    async function enviarFormulario(dadosDoFormulario) {
        const dadosParaEnvio = {
            nome: dadosDoFormulario.nome,
            email: dadosDoFormulario.email,
            senha: dadosDoFormulario.senha,
        }

        try {
            const resposta = await api.post('/usuarios', dadosParaEnvio)
            toast.success('Usuário cadastrado com sucesso!')
            reiniciarFormulario()
        } catch (erro) {
            const codigoDeErro = erro.response?.status
            const mensagemDoServidor = erro.response?.data?.mensagem || 'Ocorreu um erro ao cadastrar o usuário.'
            if (codigoDeErro === 400) {
                definirErro('email', { type: 'server', message: mensagemDoServidor })

            }
                toast.error(mensagemDoServidor)
                console.error('Erro ao cadastrar usuário:', erro)
        }
    }
    return (
        <div className='cadastro-container'>
            <h1>Cadastro de Usuário</h1>

            // Formulário de cadastro
            <form noValidate onSubmit={manipularEnvio(enviarFormulario)} className='cadastro-form'>
                {/* Campo para o Nome */}
                <div className='form-group'>
                    <label htmlFor="nome">Nome:</label>
                    <input
                        id="nome"
                        type="text"
                        placeholder='Ex: Maria Silva'
                        {...registrarCampo('nome')}
                    />
                    {errosDeValidacao.nome && <span className='error-message'>{errosDeValidacao.nome.message}</span>}
                </div>
                {/* Campo para o E-mail */}
                <div className='form-group'>
                    <label htmlFor="email">E-mail:</label>
                    <input
                        id="email"
                        type="email"
                        placeholder='Ex: maria@exemplo.com'
                        {...registrarCampo('email')}
                    />
                    {errosDeValidacao.email && <span className='error-message'>{errosDeValidacao.email.message}</span>}
                </div>
                {/* Campo para a Senha */}
                <div className='form-group'>
                    <label htmlFor="senha">Senha:</label>
                    <input
                        id="senha"
                        type="password"
                        placeholder='Digite sua senha'
                        {...registrarCampo('senha')}
                    />
                    {errosDeValidacao.senha && <span className='error-message'>{errosDeValidacao.senha.message}</span>}
                </div>
                {/* Campo para Confirmar Senha */}
                <div className='form-group'>
                    <label htmlFor="confirmarSenha">Confirmar Senha:</label>
                    <input
                        id="confirmarSenha"
                        type="password"
                        placeholder='Confirme sua senha'
                        {...registrarCampo('confirmarSenha')}
                    />
                    {errosDeValidacao.confirmarSenha && <span className='error-message'>{errosDeValidacao.confirmarSenha.message}</span>}
                    
                    <button type="submit" disabled={estaEnviando}>
                        {estaEnviando ? 'Cadastrando...' : 'Cadastrar'}
                    </button>
                </div>
            </form>
        </div>
    )
}
