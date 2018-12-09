import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse, HttpHeaders } from '@angular/common/http';
import {Observable} from 'rxjs';
import { catchError } from 'rxjs/operators';
declare var $: any;

@Injectable()
export class RTPlanService {
    constructor(private http: HttpClient) {
    }

    public glpost(model: any,url: string) {
        const body = model; // JSON.stringify(model);
        const urlvalue ="http://localhost:9091/"+url;

        console.log(url);
        // const headers = new Headers({ 'Content-Type': 'application/json' });
        console.log(JSON.stringify(model));
        return this.http.post(urlvalue, body, { responseType: 'json' });
    }

    public get(url: string) {
        const urlvalue ="http://localhost:9091/"+url;
        return this.http.get(urlvalue,{ responseType: 'json' });
            /*.subscribe(
                data => {
                    console.log("GET Request is successful ", data);
                },
                error => {
                    console.log("Error", error);
                    this.handleError;
                }
            );*/
    }

    private handleError(res: Response) {
        if (res) {
            if (res.status === 200) {
                return res.json();
            } else if ((res.status === 404 || res.status === 401 || res.status === 403 || res.status === 500)) {
                return [{ status: res.status, json: res }];
            } else {
                return [{ status: '500', json: res }];
            }
        }
    }
}
