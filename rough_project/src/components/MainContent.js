import React from 'react'
import CarouselComponent from './CarouselComponent'
import AboutPlatform from './AboutPlatform'
import LoginPage from './LoginPage'

export default function MainContent() {
    return (
        <div>
            <CarouselComponent></CarouselComponent>
            <AboutPlatform></AboutPlatform>
            <LoginPage></LoginPage>
        </div>
    )
}
