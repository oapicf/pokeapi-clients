//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_summary.dart';
import 'package:openapi/src/model/type_detail_pokemon_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/type_detail_past_damage_relations_inner.dart';
import 'package:openapi/src/model/type_detail_sprites_value_value.dart';
import 'package:openapi/src/model/ability_name.dart';
import 'package:openapi/src/model/move_damage_class_summary.dart';
import 'package:openapi/src/model/type_game_index.dart';
import 'package:openapi/src/model/type_detail_damage_relations.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_detail.g.dart';

/// Serializer for the Type resource
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [damageRelations] 
/// * [pastDamageRelations] 
/// * [gameIndices] 
/// * [generation] 
/// * [moveDamageClass] 
/// * [names] 
/// * [pokemon] 
/// * [moves] 
/// * [sprites] 
@BuiltValue()
abstract class TypeDetail implements Built<TypeDetail, TypeDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'damage_relations')
  TypeDetailDamageRelations get damageRelations;

  @BuiltValueField(wireName: r'past_damage_relations')
  BuiltList<TypeDetailPastDamageRelationsInner> get pastDamageRelations;

  @BuiltValueField(wireName: r'game_indices')
  BuiltList<TypeGameIndex> get gameIndices;

  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  @BuiltValueField(wireName: r'move_damage_class')
  MoveDamageClassSummary get moveDamageClass;

  @BuiltValueField(wireName: r'names')
  BuiltList<AbilityName> get names;

  @BuiltValueField(wireName: r'pokemon')
  BuiltList<TypeDetailPokemonInner> get pokemon;

  @BuiltValueField(wireName: r'moves')
  BuiltList<MoveSummary> get moves;

  @BuiltValueField(wireName: r'sprites')
  BuiltMap<String, BuiltMap<String, TypeDetailSpritesValueValue>> get sprites;

  TypeDetail._();

  factory TypeDetail([void updates(TypeDetailBuilder b)]) = _$TypeDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypeDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypeDetail> get serializer => _$TypeDetailSerializer();
}

class _$TypeDetailSerializer implements PrimitiveSerializer<TypeDetail> {
  @override
  final Iterable<Type> types = const [TypeDetail, _$TypeDetail];

  @override
  final String wireName = r'TypeDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypeDetail object, {
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
    yield r'damage_relations';
    yield serializers.serialize(
      object.damageRelations,
      specifiedType: const FullType(TypeDetailDamageRelations),
    );
    yield r'past_damage_relations';
    yield serializers.serialize(
      object.pastDamageRelations,
      specifiedType: const FullType(BuiltList, [FullType(TypeDetailPastDamageRelationsInner)]),
    );
    yield r'game_indices';
    yield serializers.serialize(
      object.gameIndices,
      specifiedType: const FullType(BuiltList, [FullType(TypeGameIndex)]),
    );
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'move_damage_class';
    yield serializers.serialize(
      object.moveDamageClass,
      specifiedType: const FullType(MoveDamageClassSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(AbilityName)]),
    );
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(BuiltList, [FullType(TypeDetailPokemonInner)]),
    );
    yield r'moves';
    yield serializers.serialize(
      object.moves,
      specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
    );
    yield r'sprites';
    yield serializers.serialize(
      object.sprites,
      specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltMap, [FullType(String), FullType(TypeDetailSpritesValueValue)])]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TypeDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypeDetailBuilder result,
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
        case r'damage_relations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TypeDetailDamageRelations),
          ) as TypeDetailDamageRelations;
          result.damageRelations.replace(valueDes);
          break;
        case r'past_damage_relations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeDetailPastDamageRelationsInner)]),
          ) as BuiltList<TypeDetailPastDamageRelationsInner>;
          result.pastDamageRelations.replace(valueDes);
          break;
        case r'game_indices':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeGameIndex)]),
          ) as BuiltList<TypeGameIndex>;
          result.gameIndices.replace(valueDes);
          break;
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.generation.replace(valueDes);
          break;
        case r'move_damage_class':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveDamageClassSummary),
          ) as MoveDamageClassSummary;
          result.moveDamageClass.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityName)]),
          ) as BuiltList<AbilityName>;
          result.names.replace(valueDes);
          break;
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeDetailPokemonInner)]),
          ) as BuiltList<TypeDetailPokemonInner>;
          result.pokemon.replace(valueDes);
          break;
        case r'moves':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
          ) as BuiltList<MoveSummary>;
          result.moves.replace(valueDes);
          break;
        case r'sprites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltMap, [FullType(String), FullType(TypeDetailSpritesValueValue)])]),
          ) as BuiltMap<String, BuiltMap<String, TypeDetailSpritesValueValue>>;
          result.sprites.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TypeDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypeDetailBuilder();
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

