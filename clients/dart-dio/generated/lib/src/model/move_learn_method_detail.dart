//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_learn_method_description.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/move_learn_method_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_learn_method_detail.g.dart';

/// MoveLearnMethodDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [names] 
/// * [descriptions] 
/// * [versionGroups] 
@BuiltValue()
abstract class MoveLearnMethodDetail implements Built<MoveLearnMethodDetail, MoveLearnMethodDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'names')
  BuiltList<MoveLearnMethodName> get names;

  @BuiltValueField(wireName: r'descriptions')
  BuiltList<MoveLearnMethodDescription> get descriptions;

  @BuiltValueField(wireName: r'version_groups')
  BuiltList<AbilityDetailPokemonInnerPokemon> get versionGroups;

  MoveLearnMethodDetail._();

  factory MoveLearnMethodDetail([void updates(MoveLearnMethodDetailBuilder b)]) = _$MoveLearnMethodDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveLearnMethodDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveLearnMethodDetail> get serializer => _$MoveLearnMethodDetailSerializer();
}

class _$MoveLearnMethodDetailSerializer implements PrimitiveSerializer<MoveLearnMethodDetail> {
  @override
  final Iterable<Type> types = const [MoveLearnMethodDetail, _$MoveLearnMethodDetail];

  @override
  final String wireName = r'MoveLearnMethodDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveLearnMethodDetail object, {
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
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(MoveLearnMethodName)]),
    );
    yield r'descriptions';
    yield serializers.serialize(
      object.descriptions,
      specifiedType: const FullType(BuiltList, [FullType(MoveLearnMethodDescription)]),
    );
    yield r'version_groups';
    yield serializers.serialize(
      object.versionGroups,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveLearnMethodDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveLearnMethodDetailBuilder result,
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
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveLearnMethodName)]),
          ) as BuiltList<MoveLearnMethodName>;
          result.names.replace(valueDes);
          break;
        case r'descriptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveLearnMethodDescription)]),
          ) as BuiltList<MoveLearnMethodDescription>;
          result.descriptions.replace(valueDes);
          break;
        case r'version_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.versionGroups.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveLearnMethodDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveLearnMethodDetailBuilder();
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

