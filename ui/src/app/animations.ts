import {
    trigger, transition, animate, style, query, state
  } from '@angular/animations';
import { Optional } from '@angular/core';
    
  // Routable animations
  export const fadeInAnimation =
    trigger('routeAnimations', [
      transition('* <=> *', [
        //state('in', style({opacity: 1})),
        query(':enter', [
          style({opacity: 0}),
          // and animate toward the "in" state above
          animate(200)
        ], { optional: true })
      ])
    ]);
  