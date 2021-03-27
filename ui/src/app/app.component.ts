import { Component, HostBinding } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';
import {
  trigger,
  state,
  style,
  animate,
  transition,
  // ...
} from '@angular/animations';
import { fadeInAnimation } from './animations';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  animations: [
    fadeInAnimation
    // animation triggers go here
  ]
})
export class AppComponent {
  title = 'ui';
  isHome: boolean = true;

  navbarOpen = false;
  public animationsDisabled = false;

  constructor(private router: Router) { }

  prepareRoute(outlet: RouterOutlet) {
    return outlet && outlet.activatedRouteData && outlet.activatedRouteData['animation'];
  }

  toggleNavbar() {
    this.navbarOpen = !this.navbarOpen;
    console.log(this.router.url);
  }

}
