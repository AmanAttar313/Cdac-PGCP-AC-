import React from 'react'
import Carousel from 'react-bootstrap/Carousel';
import imgpath from '../shared/constant/constant';

const MyCrouselCompo = () => {
  return (
    <div>
        <Carousel>
      <Carousel.Item>
        <img src={imgpath.chocolategulabjamun} alt="breadGulab" style={{width:"300px",height:"300px"}}/>
        <Carousel.Caption>
          <h3>First slide label</h3>
          <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        {/* <ExampleCarouselImage text="Second slide" /> */}
        <img src={imgpath.breadGulab} alt="breadGulab" style={{width:"300px",height:"300px"}}/>
        <Carousel.Caption>
          <h3>Second slide label</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
       <img src={imgpath.rabdigulabjamun} alt="breadGulab" style={{width:"300px",height:"300px"}}/>
        <Carousel.Caption>
          <h3>Third slide label</h3>
          <p>
            Praesent commodo cursus magna, vel scelerisque nisl consectetur.
          </p>
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
    </div>
  )
}

export default MyCrouselCompo