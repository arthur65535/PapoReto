import React, {useRef} from 'react'
import {Button, Container, Form} from 'react-bootstrap'
import { v4 as uuidV4} from "uuid";

export default function Login({onIdSubmit}){
    const idRef = useRef();

    const handleSubmit = (e) =>{
        e.preventDefault()

        onIdSubmit(idRef.current.value)
    }

    const createNewLogin = () =>{
        onIdSubmit(uuidV4())
    }

    return (
       <Container className="align-items-center d-flex" style={{height: '100vh'}}>
           <Form className="w-100" onSubmit={handleSubmit}>
               <Form.Group>
                   <Form.Label>Digite seu login</Form.Label>
                   <Form.Control type="text" ref={idRef} required />
               </Form.Group>
               <br />
               <Button type="submit" style={{marginRight: "10px"}}>
                   Entrar
               </Button>
               <Button onClick={createNewLogin} variant="secondary">
                   Criar login aleatorio
               </Button>
           </Form>
       </Container>
    )
}