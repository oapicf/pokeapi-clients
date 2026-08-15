//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_form_detail_form_names_inner.dart';
import 'package:openapi/src/model/pokemon_form_detail_sprites.dart';
import 'package:openapi/src/model/pokemon_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:openapi/src/model/pokemon_detail_types_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_form_detail.g.dart';

/// PokemonFormDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [order] 
/// * [formOrder] 
/// * [isDefault] 
/// * [isBattleOnly] 
/// * [isMega] 
/// * [formName] 
/// * [pokemon] 
/// * [sprites] 
/// * [versionGroup] 
/// * [formNames] 
/// * [names] 
/// * [types] 
@BuiltValue()
abstract class PokemonFormDetail implements Built<PokemonFormDetail, PokemonFormDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'order')
  int? get order;

  @BuiltValueField(wireName: r'form_order')
  int? get formOrder;

  @BuiltValueField(wireName: r'is_default')
  bool? get isDefault;

  @BuiltValueField(wireName: r'is_battle_only')
  bool? get isBattleOnly;

  @BuiltValueField(wireName: r'is_mega')
  bool? get isMega;

  @BuiltValueField(wireName: r'form_name')
  String get formName;

  @BuiltValueField(wireName: r'pokemon')
  PokemonSummary get pokemon;

  @BuiltValueField(wireName: r'sprites')
  PokemonFormDetailSprites get sprites;

  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  @BuiltValueField(wireName: r'form_names')
  BuiltList<PokemonFormDetailFormNamesInner> get formNames;

  @BuiltValueField(wireName: r'names')
  BuiltList<PokemonFormDetailFormNamesInner> get names;

  @BuiltValueField(wireName: r'types')
  BuiltList<PokemonDetailTypesInner> get types;

  PokemonFormDetail._();

  factory PokemonFormDetail([void updates(PokemonFormDetailBuilder b)]) = _$PokemonFormDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonFormDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonFormDetail> get serializer => _$PokemonFormDetailSerializer();
}

class _$PokemonFormDetailSerializer implements PrimitiveSerializer<PokemonFormDetail> {
  @override
  final Iterable<Type> types = const [PokemonFormDetail, _$PokemonFormDetail];

  @override
  final String wireName = r'PokemonFormDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonFormDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.order != null) {
      yield r'order';
      yield serializers.serialize(
        object.order,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.formOrder != null) {
      yield r'form_order';
      yield serializers.serialize(
        object.formOrder,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.isDefault != null) {
      yield r'is_default';
      yield serializers.serialize(
        object.isDefault,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isBattleOnly != null) {
      yield r'is_battle_only';
      yield serializers.serialize(
        object.isBattleOnly,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isMega != null) {
      yield r'is_mega';
      yield serializers.serialize(
        object.isMega,
        specifiedType: const FullType(bool),
      );
    }
    yield r'form_name';
    yield serializers.serialize(
      object.formName,
      specifiedType: const FullType(String),
    );
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(PokemonSummary),
    );
    yield r'sprites';
    yield serializers.serialize(
      object.sprites,
      specifiedType: const FullType(PokemonFormDetailSprites),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
    );
    yield r'form_names';
    yield serializers.serialize(
      object.formNames,
      specifiedType: const FullType(BuiltList, [FullType(PokemonFormDetailFormNamesInner)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(PokemonFormDetailFormNamesInner)]),
    );
    yield r'types';
    yield serializers.serialize(
      object.types,
      specifiedType: const FullType(BuiltList, [FullType(PokemonDetailTypesInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonFormDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonFormDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.order = valueDes;
          break;
        case r'form_order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.formOrder = valueDes;
          break;
        case r'is_default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isDefault = valueDes;
          break;
        case r'is_battle_only':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isBattleOnly = valueDes;
          break;
        case r'is_mega':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isMega = valueDes;
          break;
        case r'form_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.formName = valueDes;
          break;
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonSummary),
          ) as PokemonSummary;
          result.pokemon.replace(valueDes);
          break;
        case r'sprites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonFormDetailSprites),
          ) as PokemonFormDetailSprites;
          result.sprites = valueDes;
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
          break;
        case r'form_names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonFormDetailFormNamesInner)]),
          ) as BuiltList<PokemonFormDetailFormNamesInner>;
          result.formNames.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonFormDetailFormNamesInner)]),
          ) as BuiltList<PokemonFormDetailFormNamesInner>;
          result.names.replace(valueDes);
          break;
        case r'types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonDetailTypesInner)]),
          ) as BuiltList<PokemonDetailTypesInner>;
          result.types.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonFormDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonFormDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

