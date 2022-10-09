export * from './document.service';
import { DocumentService } from './document.service';
export * from './element.service';
import { ElementService } from './element.service';
export * from './folder.service';
import { FolderService } from './folder.service';
export * from './namespace.service';
import { NamespaceService } from './namespace.service';
export const APIS = [DocumentService, ElementService, FolderService, NamespaceService];
